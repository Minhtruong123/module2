package furama_resort.service;

import furama_resort.model.person.Customer;

public interface ICustomerService {
    void displayListCustomer();

    void add(Customer customer);

    void change(Customer customer);
}
