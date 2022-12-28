package furama_resort.controller;

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
        Scanner sc=new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        int choose1;
        EmployeeService employeeService = new EmployeeService();
        do {
            employeeManager.displayMiniMenu1();
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
                    String phoneNumber12 = sc.nextLine();
                    System.out.println("Gender (Man: 1, Women: 0): ");
                    int numb12 = Integer.parseInt(sc.nextLine());
                    boolean gender12;
                    if (numb12 == 1) {
                        gender12 = true;
                    } else {
                        gender12 = false;
                    }
                    System.out.println("Identity card: ");
                    String identity12 = sc.nextLine();
                    System.out.println("Email: ");
                    String email12 = sc.nextLine();
                    System.out.println("Level: ");
                    String level12 = sc.nextLine();
                    System.out.println("Position: ");
                    String position12 = sc.nextLine();
                    System.out.println("Salary: ");
                    String salary12 = sc.nextLine();
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
                                String phoneNumber14 = sc.nextLine();
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
                                String identity14 = sc.nextLine();
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
        } while (choose1 != 5);
    }
}
