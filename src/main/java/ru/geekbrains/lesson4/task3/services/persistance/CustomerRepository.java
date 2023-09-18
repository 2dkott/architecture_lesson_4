package ru.geekbrains.lesson4.task3.services.persistance;

import ru.geekbrains.lesson4.task3.domain.Customer;
import ru.geekbrains.lesson4.task3.domain.NoCustomerException;

import java.util.Collection;

public interface CustomerRepository {
    Collection<Customer> getCustomers();
    Customer getCustomerByLogin(String login) throws NoCustomerException;
    void saveCustomer(Customer login);
}
