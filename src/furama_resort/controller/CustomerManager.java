package furama_resort.controller;

import furama_resort.model.person.Customer;
import furama_resort.service.Impl.CustomerService;

import java.util.Scanner;

public class CustomerManager {
    void displayMiniMenu2() {
        System.out.println("---Menu of Customer Management--- \n" +
                "1.Display list customers \n" +
                "2.Add new customer \n" +
                "3.Edit customer \n" +
                "4.Return main menu \n");
    }
    public void customerManagerMini(){
        Scanner sc=new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        CustomerService customerService = new CustomerService();
        int choose2;
        do {
            customerManager.displayMiniMenu2();
            choose2 = Integer.parseInt(sc.nextLine());
            switch (choose2) {
                case 1:
                    customerService.displayListCustomer();
                    break;
                case 2:
                    System.out.println("ID: ");
                    String id22 = sc.nextLine();
                    System.out.println("Name: ");
                    String name22 = sc.nextLine();
                    System.out.println("Date of birth: ");
                    String dateOfBirth22 = sc.nextLine();
                    System.out.println("Phone number: ");
                    String phoneNumber22 = sc.nextLine();
                    System.out.println("Gender (Man: 1, Women: 0): ");
                    String gender22 = sc.nextLine();
                    System.out.println("Indentity card: ");
                    String identity22 = sc.nextLine();
                    System.out.println("Email: ");
                    String email22 = sc.nextLine();
                    System.out.println("Type: ");
                    String type22 = sc.nextLine();
                    System.out.println("Address: ");
                    String address22 = sc.nextLine();
                    Customer customer22 = new Customer(id22, name22, dateOfBirth22, phoneNumber22, gender22, identity22, email22, type22, address22);
                    customerService.add(customer22);
                    break;
                case 3:
                    System.out.println("ID of the customer you want to edit: ");
                    String id23 = sc.nextLine();
                    int choose23;
                    Customer customer = customerService.findByID(id23);
                    if (customer != null) {
                        System.out.println("Input number you want to edit: \n" +
                                "1.Name \n" +
                                "2.Date of birth \n" +
                                "3.Phone number \n" +
                                "4.Gender \n" +
                                "5.Identity card \n" +
                                "6.Email \n" +
                                "7.Type \n" +
                                "8.Address ");
                        choose23 = Integer.parseInt(sc.nextLine());
                        switch (choose23) {
                            case 1:
                                System.out.println("Input new name: ");
                                String name23 = sc.nextLine();
                                customer.setName(name23);
                                customerService.change(customer);
                                break;
                            case 2:
                                System.out.println("Input new date of birth: ");
                                String dateOfBirth23 = sc.nextLine();
                                customer.setdateOfBirth(dateOfBirth23);
                                customerService.change(customer);
                                break;
                            case 3:
                                System.out.println("Input new phone number: ");
                                String phoneNumber23 = sc.nextLine();
                                customer.setPhoneNumber(phoneNumber23);
                                customerService.change(customer);
                                break;
                            case 4:
                                System.out.println("Input new gender ");
                                String gender23 = sc.nextLine();
                                customer.setGender(gender23);
                                customerService.change(customer);
                                break;
                            case 5:
                                System.out.println("Input new identity card: ");
                                String identity23 = sc.nextLine();
                                customer.setIdentityCard(identity23);
                                customerService.change(customer);
                                break;
                            case 6:
                                System.out.println("Input new email: ");
                                String email23 = sc.nextLine();
                                customer.setEmail(email23);
                                customerService.change(customer);
                                break;
                            case 7:
                                System.out.println("Input new type: ");
                                String type23 = sc.nextLine();
                                customer.setType(type23);
                                customerService.change(customer);
                                break;
                            case 8:
                                System.out.println("Input new address: ");
                                String address23 = sc.nextLine();
                                customer.setAddress(address23);
                                customerService.change(customer);
                                break;
                        }
                    } else {
                        System.out.println("Wrong ID");
                    }
                    break;
            }
        } while (choose2 != 4);
    }
}
