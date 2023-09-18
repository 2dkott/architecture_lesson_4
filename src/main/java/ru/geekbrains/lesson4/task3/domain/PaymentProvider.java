package ru.geekbrains.lesson4.task3.domain;

public interface PaymentProvider {
    boolean buyTicket(int orderId, String cardNo, double amount);
}
