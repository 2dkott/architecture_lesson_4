package ru.geekbrains.lesson4.task3.services;

import ru.geekbrains.lesson4.task3.domain.Customer;
import ru.geekbrains.lesson4.task3.domain.CustomerProvider;
import ru.geekbrains.lesson4.task3.domain.NoCustomerException;
import ru.geekbrains.lesson4.task3.services.persistance.CustomerRepository;

public class MobileCustomerProvider implements CustomerProvider {

    private CustomerRepository repository;

    public MobileCustomerProvider(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer getCustomer(String login, String password) throws NoCustomerException {
        return repository.getCustomerByLogin(login);
    }

    @Override
    public void saveCustomer(Customer customer) {
        repository.saveCustomer(customer);
    }
}
