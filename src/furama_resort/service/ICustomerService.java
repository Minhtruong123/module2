package furama_resort.service;

import furama_resort.model.person.Customer;

public interface ICustomerService {
    void displayListCustomer();

    void add(Customer customer);

    Customer findByID(String id);

    void change(Customer customer);
}
