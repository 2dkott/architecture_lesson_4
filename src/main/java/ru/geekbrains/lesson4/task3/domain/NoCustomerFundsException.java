package ru.geekbrains.lesson4.task3.domain;

public class NoCustomerFundsException extends Exception{
    public NoCustomerFundsException(int userId) {
        super(String.format("У Клиента недостаточно средств: Юзер %s", userId));
    }
}
