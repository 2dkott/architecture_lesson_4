package ru.geekbrains.lesson4.task3.services;

import ru.geekbrains.lesson4.task3.domain.TicketProvider;
import ru.geekbrains.lesson4.task3.domain.TransportStation;

/**
 * Автобусная станция
 */
public class BusStation implements TransportStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrCode){
        return ticketProvider.checkTicket(qrCode);
    }

}
