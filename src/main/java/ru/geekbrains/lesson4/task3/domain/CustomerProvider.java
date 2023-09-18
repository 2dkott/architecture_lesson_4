package ru.geekbrains.lesson4.task3.domain;

public interface CustomerProvider {
    Customer getCustomer(String login, String password) throws NoCustomerException;

    void saveCustomer(Customer customer);
}
