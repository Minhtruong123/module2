package furama_resort.controller;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;
import furama_resort.model.facility.Villa;
import furama_resort.service.IFacilityService;
import furama_resort.service.Impl.FacilityService;

import java.util.Scanner;

public class FacilityManager {
    void displayMiniMenu3() {
        System.out.println("---Menu of Facility Management--- \n" +
                "1.Display list facility \n" +
                "2.Add new facility \n" +
                "3.Display list facility maintenance \n" +
                "4.Return main menu \n");
    }

    public void facilityManagerMini() {
        Scanner sc = new Scanner(System.in);
        FacilityManager facilityManager = new FacilityManager();
        IFacilityService facilityService = new FacilityService();
        int choose3;
        do {
            facilityManager.displayMiniMenu3();
            choose3 = Integer.parseInt(sc.nextLine());
            switch (choose3) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    System.out.println("New room or villa (1:Room, 2:Villa)");
                    int numb32 = Integer.parseInt(sc.nextLine());
                    if (numb32 == 1) {
                        System.out.println("New name service: ");
                        String nameService32 = sc.nextLine();
                        System.out.println("Usable are: ");
                        int usableAre32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Rental costs");
                        int rentalCost32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Max number of people: ");
                        int maxNumbOfPeople32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Rental type");
                        String rentalType = sc.nextLine();
                        System.out.println("Free service: ");
                        String freeService32 = sc.nextLine();
                        System.out.println("Number of uses: ");
                        int numbOfUse32 = Integer.parseInt(sc.nextLine());
                        Facility room = new Room(nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, freeService32);
                        facilityService.add(room, numbOfUse32);
                    } else {
                        System.out.println("New name service: ");
                        String nameService32 = sc.nextLine();
                        System.out.println("Usable are: ");
                        int usableAre32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Rental costs");
                        int rentalCost32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Max number of people: ");
                        int maxNumbOfPeople32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Rental type");
                        String rentalType = sc.nextLine();
                        System.out.println("Room standard: ");
                        String roomStandard32 = sc.nextLine();
                        System.out.println("Pool area: ");
                        int poolArea32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Floors: ");
                        int floors32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Number of uses: ");
                        int numbOfUse32 = Integer.parseInt(sc.nextLine());
                        Facility villa = new Villa(nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, roomStandard32, poolArea32, floors32);
                        facilityService.add(villa, numbOfUse32);
                    }
                case 3:
                    facilityService.displayFacilityMaintenace();
                    break;
            }
        } while (choose3 != 4);
    }
}
