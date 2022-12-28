package furama_resort.service.Impl;

import furama_resort.model.person.Customer;
import furama_resort.service.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer(1, "Nguyen Van A", "14/6/1998", "95462597", true, "132654789", "nguyenvanA@gmail.com", "Diamond", "123 Cu Chinh Lan, Da Nang"));
        customerList.add(new Customer(2, "Nguyen Van B", "8/11/1998", "95469788", false, "465834789", "nguyenvanB@gmail.com", "Member", "99 Hoang Dieu, Da Nang"));
        customerList.add(new Customer(3, "Nguyen Van C", "9/9/1995", "95469782", true, "315241789", "nguyenvanC@gmail.com", "Gold", "12 Phan Chau Trinh, Da Nang"));
    }

    @Override
    public void displayListCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public Customer findByID(int id) {
        for (int i=0;i<customerList.size();i++){
            if (customerList.get(i).getId()==id){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void change(Customer customer) {
        for (int i=0;i<customerList.size();i++){
            if (customerList.get(i).getId()==customer.getId()){
                customerList.set(i,customer);
            }
        }
    }
}
