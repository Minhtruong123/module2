package furama_resort.controller;

import furama_resort.Regex;
import furama_resort.model.person.Employee;
import furama_resort.service.Impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManager {
    void displayMiniMenu1() {
        System.out.println("---Menu of Employee Management--- \n" +
                "1.Display list employees \n" +
                "2.Add new employee \n" +
                "3.Delete employee \n" +
                "4.Edit employee \n" +
                "5.Return main menu \n");
    }

    public void employeeManagerMini() {
        Scanner sc = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        String choose1;
        EmployeeService employeeService = new EmployeeService();
        do {
            employeeManager.displayMiniMenu1();
            do {
                System.out.println("Input");
                choose1 = sc.nextLine();
            } while (!Regex.isNum(choose1));
            switch (choose1) {
                case "1":
                    employeeService.disPlayListEmployee();
                    break;
                case "2":
                    System.out.println("The ID: ");
                    String id12 = sc.nextLine();
                    String name12;
                    do {
                        System.out.println("Name of the new employee: ");
                        name12 = sc.nextLine();
                    } while (!Regex.checkRegexNameService(name12));
                    String dateOfBirth12;
                    do {
                        System.out.println("Date of birth: (dd-MM-yyyy)");
                        dateOfBirth12 = sc.nextLine();
                    } while (!Regex.checkDateOfBirth(dateOfBirth12));
                    String phoneNumber12;
                    do {
                        System.out.println("Phone number: ");
                        phoneNumber12 = sc.nextLine();
                    } while (!Regex.checkPhone(phoneNumber12));
                    System.out.println("Gender");
                    String gender12 = sc.nextLine();
                    String identity12;
                    do {
                        System.out.println("Identity card: ");
                        identity12 = sc.nextLine();
                    } while (!Regex.checkIDNumb(identity12));
                    String email12;
                    do {
                        System.out.println("Email: ");
                        email12 = sc.nextLine();
                    } while (!Regex.checkEmail(email12));
                    System.out.println("Level: ");
                    String level12 = sc.nextLine();
                    System.out.println("Position: ");
                    String position12 = sc.nextLine();
                    System.out.println("Salary: ");
                    String salary12 = sc.nextLine();
                    Employee employee1 = new Employee(id12, name12, dateOfBirth12, phoneNumber12, gender12, identity12, email12, level12, position12, salary12);
                    employeeService.add(employee1);
                    break;
                case "3":
                    System.out.println("ID you want to delete: ");
                    String id13 = sc.nextLine();
                    int index13 = employeeService.findID(id13);
                    if (index13 > -1) {
                        employeeService.delete(index13);
                    } else {
                        System.out.println("The ID is not in the list");
                    }
                    break;
                case "4":
                    String id14;
                    System.out.println("Input the ID you want to edit: ");
                    id14 = sc.nextLine();
                    Employee e = employeeService.findEmployee(id14);
                    if (e != null) {
                        System.out.println("Input number you want to edit: \n" +
                                "1.Name \n" +
                                "2.Date of birth \n" +
                                "3.Phone Number \n" +
                                "4.Gender \n" +
                                "5.Identity card \n" +
                                "6.Email \n" +
                                "7.Salary \n");
                        String choose14;
                        do {
                            System.out.println("Input");
                            choose14 = sc.nextLine();
                        } while (!Regex.isNum(choose14));
                        switch (choose14) {
                            case "1":
                                String name14;
                                do {
                                    System.out.println("New name: ");
                                    name14 = sc.nextLine();
                                } while (!Regex.checkRegexNameService(name14));
                                e.setName(name14);
                                employeeService.change(e);
                                break;
                            case "2":
                                String dateOfBirth14;
                                do {
                                    System.out.println("New date of birth: (dd-MM-yyyy)");
                                    dateOfBirth14 = sc.nextLine();
                                } while (!Regex.checkDateOfBirth(dateOfBirth14));
                                e.setdateOfBirth(dateOfBirth14);
                                employeeService.change(e);
                                break;
                            case "3":
                                String phoneNumber14;
                                do {
                                    System.out.println("New phone number: ");
                                    phoneNumber14 = sc.nextLine();
                                } while (!Regex.checkPhone(phoneNumber14));
                                e.setPhoneNumber(phoneNumber14);
                                employeeService.change(e);
                                break;
                            case "4":
                                System.out.println("Gender ");
                                String gender14 = sc.nextLine();
                                e.setGender(gender14);
                                employeeService.change(e);
                                break;
                            case "5":
                                String identity14;
                                do {
                                    System.out.println("New identity card: ");
                                    identity14 = sc.nextLine();
                                } while (!Regex.checkIDNumb(identity14));
                                e.setIdentityCard(identity14);
                                break;
                            case "6":
                                String email14;
                                do {
                                    System.out.println("New email: ");
                                    email14 = sc.nextLine();
                                } while (!Regex.checkEmail(email14));
                                e.setEmail(email14);
                                employeeService.change(e);
                                break;
                            case "7":
                                System.out.println("New salary: ");
                                String salary14 = sc.nextLine();
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
            }
        } while (Integer.parseInt(choose1) != 5);
    }
}
