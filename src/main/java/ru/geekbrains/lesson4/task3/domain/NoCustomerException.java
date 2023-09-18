package ru.geekbrains.lesson4.task3.domain;

public class NoCustomerException extends Exception{
    public NoCustomerException(String login) {
        super(String.format("Клиент не найден: Логин %s", login));
    }
}
