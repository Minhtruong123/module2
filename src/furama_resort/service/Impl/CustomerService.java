package furama_resort.service.Impl;

import furama_resort.model.person.Customer;
import furama_resort.service.ICustomerService;
import furama_resort.util.CustomerRnW;

import java.util.List;

public class CustomerService implements ICustomerService {

    @Override
    public void displayListCustomer() {
        List<Customer> customerList = CustomerRnW.readFile();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = CustomerRnW.readFile();
        customerList.add(customer);
        CustomerRnW.writeFile(customerList);
    }

    @Override
    public Customer findByID(String id) {
        List<Customer> customerList = CustomerRnW.readFile();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void change(Customer customer) {
        List<Customer> customerList = CustomerRnW.readFile();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(customer.getId())) {
                customerList.set(i, customer);
            }
        }
        CustomerRnW.writeFile(customerList);
    }
}
