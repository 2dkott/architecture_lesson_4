package ru.geekbrains.lesson4.task3.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public interface TicketProvider {

    Collection<Ticket> searchTicketsByDate(int clientId, LocalDate date);

    Ticket buyTicket(int clientId, String cardNo) throws NoCustomerFundsException;

    boolean checkTicket(String qrcode);

    void saveTicket(Ticket ticket);
}
