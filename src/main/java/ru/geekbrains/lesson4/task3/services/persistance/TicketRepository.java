package ru.geekbrains.lesson4.task3.services.persistance;

import ru.geekbrains.lesson4.task3.domain.Customer;
import ru.geekbrains.lesson4.task3.domain.Ticket;

import java.util.Collection;

public interface TicketRepository {
    Collection<Ticket> getTickets();
    double getTicketAmount();
    int createTicketOrder(int clientId);

    void saveTicket(Ticket ticket);
}
