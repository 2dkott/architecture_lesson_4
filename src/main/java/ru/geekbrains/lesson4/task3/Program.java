package ru.geekbrains.lesson4.task3;

import ru.geekbrains.lesson4.task3.domain.Customer;
import ru.geekbrains.lesson4.task3.domain.CustomerProvider;
import ru.geekbrains.lesson4.task3.domain.NoCustomerFundsException;
import ru.geekbrains.lesson4.task3.domain.TicketProvider;
import ru.geekbrains.lesson4.task3.services.*;
import ru.geekbrains.lesson4.task3.services.persistance.Database;

import java.util.Date;

public class Program {

/**
 * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
 *
 * 1.  Предусловия.
 * 2.  Постусловия.
 * 3.  Инвариант.
 * 4.  Определить абстрактные и конкретные классы.
 * 5.  Определить интерфейсы.
 * 6.  Реализовать наследование.
 * 7.  Выявить компоненты.
 * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
 */
    public static void main(String[] args) {

        Customer customer = new Customer("Test User");
        Database database = new Database();
        TicketProvider ticketProvider = new MoscowTicketProvider(database, new BankPaymentProvider());
        CustomerProvider customerProvider = new MobileCustomerProvider(database);
        customerProvider.saveCustomer(customer);

        BusStation busStation = new BusStation(ticketProvider);

        MobileApp mobileApp = new MobileApp(ticketProvider, new MobileCustomerProvider(database));


        try {
            mobileApp.login(customer.getLogin());

            if(mobileApp.getTickets().isEmpty()) {
                mobileApp.buyTicket("1111");
            }
            String id = mobileApp.getTickets().stream().toList().get(0).getQrcode();
            busStation.checkTicket(mobileApp.getTickets().stream().toList().get(0).getQrcode());

        } catch (NoCustomerFundsException e) {
            System.out.println(e.getMessage());
        }

        //if (){
          //  System.out.println("Клиент успешно купил билет.");
            //mobileApp.searchTicket(new Date());
            /*Collection<Ticket> tickets = mobileApp.getTickets();
            if (busStation.checkTicket(tickets.stream().findFirst().get().getQrcode())){
                System.out.println("Клиент успешно прошел в автобус.");
            }*/
        }




}

















