package furama_resort.controller;

import furama_resort.Regex;

import java.util.Scanner;

public class FuramaController {
    void displayMainMenu() {
        System.out.println("-----Menu----- \n" +
                "1. Employee Management \n" +
                "2. Customer Management \n" +
                "3. Facility Management \n" +
                "4. Booking Management \n" +
                "5. Promotion Management \n" +
                "6. Exit \n");
    }

    void displayMiniMenu4() {
        System.out.println("---Menu of Booking Management--- \n" +
                "1.Add new booking \n" +
                "2.Display list booking \n" +
                "3.Return main menu \n");
    }

    void displayMiniMenu5() {
        System.out.println("---Menu of Promotion Management--- \n" +
                "1.Display list customers use service \n" +
                "2.Display list customers get voucher \n" +
                "3.Return main menu \n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FuramaController furamaController = new FuramaController();
        do {
            furamaController.displayMainMenu();
            String choose;
            do {
                System.out.println("Input: ");
                choose = sc.nextLine();
                if (!Regex.isNum(choose)){
                    System.err.println("Wrong format.Input again");
                }
            } while (!Regex.isNum(choose));
            switch (choose) {
                case "1":
                    EmployeeManager employeeManager = new EmployeeManager();
                    employeeManager.employeeManagerMini();
                    break;
                case "2":
                    CustomerManager customerManager = new CustomerManager();
                    customerManager.customerManagerMini();
                    break;
                case "3":
                    FacilityManager facilityManager = new FacilityManager();
                    facilityManager.facilityManagerMini();
                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    System.exit(0);
            }
        } while (true);
    }
}
