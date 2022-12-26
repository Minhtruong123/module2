package furama_resort.controller;

import furama_resort.model.person.Customer;
import furama_resort.model.person.Employee;
import furama_resort.service.Impl.CustomerService;
import furama_resort.service.Impl.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    void displayMainMenu() {
        System.out.println("-----Menu-----" +
                "1. Employee Management" +
                "2. Customer Management" +
                "3. Facility Management" +
                "4. Booking Management" +
                "5. Promotion Management" +
                "6. Exit");
    }

    void displayMiniMenu1() {
        System.out.println("---Menu of Employee Management---" +
                "1.Display list employees" +
                "2.Add new employee" +
                "3.Delete employee" +
                "4.Edit employee" +
                "5.Return main menu");
    }

    void displayMiniMenu2() {
        System.out.println("---Menu of Customer Management---" +
                "1.Display list customers" +
                "2.Add new customer" +
                "3.Edit customer" +
                "4.Return main menu");
    }

    void displayMiniMenu3() {
        System.out.println("---Menu of Facility Management---" +
                "1.Display list facility" +
                "2.Add new facility" +
                "3.Display list facility maintenance" +
                "4.Return main menu");
    }

    void displayMiniMenu4() {
        System.out.println("---Menu of Booking Management---" +
                "1.Add new booking" +
                "2.Display list booking" +
                "3.Return main menu");
    }

    void displayMiniMenu5() {
        System.out.println("---Menu of Promotion Management---" +
                "1.Display list customers use service" +
                "2.Display list customers get voucher" +
                "3.Return main menu");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FuramaController furamaController = new FuramaController();
        do {
            furamaController.displayMainMenu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    int choose1;
                    EmployeeService employeeService = new EmployeeService();
                    do {
                        furamaController.displayMiniMenu1();
                        choose1 = Integer.parseInt(sc.nextLine());
                        switch (choose1) {
                            case 1:
                                employeeService.disPlayListEmployee();
                                break;
                            case 2:
                                System.out.println("The ID: ");
                                int id12 = Integer.parseInt(sc.nextLine());
                                System.out.println("Name of the new employee: ");
                                String name12 = sc.nextLine();
                                System.out.println("Date of birth: ");
                                String dateOfBirth12 = sc.nextLine();
                                System.out.println("Phone number: ");
                                int phoneNumber12 = Integer.parseInt(sc.nextLine());
                                System.out.println("Gender (Man: 1, Women: 0): ");
                                int numb12 = Integer.parseInt(sc.nextLine());
                                boolean gender12;
                                if (numb12 == 1) {
                                    gender12 = true;
                                } else {
                                    gender12 = false;
                                }
                                System.out.println("Identity card: ");
                                int identity12 = Integer.parseInt(sc.nextLine());
                                System.out.println("Email: ");
                                String email12 = sc.nextLine();
                                System.out.println("Level: ");
                                String level12 = sc.nextLine();
                                System.out.println("Position: ");
                                String position12 = sc.nextLine();
                                System.out.println("Salary: ");
                                int salary12 = Integer.parseInt(sc.nextLine());
                                Employee employee1 = new Employee(id12, name12, dateOfBirth12, phoneNumber12, gender12, identity12, email12, level12, position12, salary12);
                                employeeService.add(employee1);
                                break;
                            case 3:
                                System.out.println("ID you want to delete: ");
                                int id13 = Integer.parseInt(sc.nextLine());
                                int index13 = employeeService.findID(id13);
                                if (index13 > -1) {
                                    employeeService.delete(index13);
                                } else {
                                    System.out.println("The ID is not in the list");
                                }
                                break;
                            case 4:
                                System.out.println("Input the ID you want to edit: ");
                                int id14 = Integer.parseInt(sc.nextLine());
                                Employee e = employeeService.findEmployee(id14);
                                if (e != null) {
                                    System.out.println("Input number you want to edit: " +
                                            "1.Name \n" +
                                            "2.Date of birth \n" +
                                            "3.Phone Number \n" +
                                            "4.Gender \n" +
                                            "5.Identity card \n" +
                                            "6.Email \n" +
                                            "7.Salary \n");
                                    int choose14 = Integer.parseInt(sc.nextLine());
                                    switch (choose14) {
                                        case 1:
                                            System.out.println("New name: ");
                                            String name14 = sc.nextLine();
                                            e.setName(name14);
                                            employeeService.change(e);
                                            break;
                                        case 2:
                                            System.out.println("New date of birth: ");
                                            String dateOfBirth14 = sc.nextLine();
                                            e.setdateOfBirth(dateOfBirth14);
                                            employeeService.change(e);
                                            break;
                                        case 3:
                                            System.out.println("New phone number: ");
                                            int phoneNumber14 = Integer.parseInt(sc.nextLine());
                                            e.setPhoneNumber(phoneNumber14);
                                            employeeService.change(e);
                                            break;
                                        case 4:
                                            System.out.println("Gender (Man: 1, Women: 0): ");
                                            int numb14 = Integer.parseInt(sc.nextLine());
                                            boolean gender14;
                                            if (numb14 == 1) {
                                                gender14 = true;
                                            } else {
                                                gender14 = false;
                                            }
                                            e.setGender(gender14);
                                            employeeService.change(e);
                                            break;
                                        case 5:
                                            System.out.println("New identity card: ");
                                            int identity14 = Integer.parseInt(sc.nextLine());
                                            e.setIdentityCard(identity14);
                                            break;
                                        case 6:
                                            System.out.println("New email: ");
                                            String email14 = sc.nextLine();
                                            e.setEmail(email14);
                                            employeeService.change(e);
                                            break;
                                        case 7:
                                            System.out.println("New salary: ");
                                            int salary14 = Integer.parseInt(sc.nextLine());
                                            e.setSalary(salary14);
                                            employeeService.change(e);
                                            break;
                                        default:
                                            System.exit(0);
                                    }
                                } else {
                                    System.out.println("ID wrong");
                                }
                                break;
                            case 5:

                                break;
                        }
                    } while (choose1 == 6);
                    break;
                case 2:
                    CustomerService customerService = new CustomerService();
                    int choose2;
                    do {
                        furamaController.displayMiniMenu2();
                        choose2=Integer.parseInt(sc.nextLine());
                        switch (choose2){
                            case 1:
                                customerService.displayListCustomer();
                                break;
                            case 2:
                                System.out.println("ID: ");
                                int id22=Integer.parseInt(sc.nextLine());
                                System.out.println("Name: ");
                                String name22=sc.nextLine();
                                System.out.println("Date of birth: ");
                                String dateOfBirth22=sc.nextLine();
                                System.out.println("Phone number: ");
                                int phoneNumber22=Integer.parseInt(sc.nextLine());
                                System.out.println("Gender: ");
                                int numb22=Integer.parseInt(sc.nextLine());
                                boolean gender22;
                                if (numb22 == 1) {
                                    gender22 = true;
                                } else {
                                    gender22 = false;
                                }
                                System.out.println("Indentity card: ");
                                int identity22=Integer.parseInt(sc.nextLine());
                                System.out.println("Email: ");
                                String email22=sc.nextLine();
                                System.out.println("Type: ");
                                String type22=sc.nextLine();
                                System.out.println("Address: ");
                                String address22=sc.nextLine();
                                Customer customer22= new Customer(id22,name22,dateOfBirth22,phoneNumber22,gender22,identity22,email22,type22,address22);
                                customerService.add(customer22);
                                break;
                            case 3:
                                System.out.println("ID of the customer you want to edit: ");
                                int id23=Integer.parseInt(sc.nextLine());
                                
                                break;
                        }
                    }while (true);
//                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
