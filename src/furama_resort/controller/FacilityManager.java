package furama_resort.controller;

import furama_resort.Regex;
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
                        String id32;
                        do {
                            System.out.println("Input ID");
                            id32 = sc.nextLine();
                        } while (!Regex.checkRegexIDRoom(id32));
                        String nameService32;
                        do {
                            System.out.println("New name service: ");
                            nameService32 = sc.nextLine();
                        } while (!Regex.checkRegexNameService(nameService32));
                        String usableAre32;
                        do {
                            System.out.println("Usable are: ");
                            usableAre32 = sc.nextLine();
                        } while (!Regex.checkRegexRegexArea(usableAre32));
                        String rentalCost32;
                        do {
                            System.out.println("Rental costs");
                            rentalCost32 = sc.nextLine();
                        } while (!Regex.checkRegexRentalCost(rentalCost32));
                        String maxNumbOfPeople32;
                        do {
                            System.out.println("Max number of people: ");
                            maxNumbOfPeople32 = sc.nextLine();
                        } while (!Regex.checkRegexMaxPeople(maxNumbOfPeople32));
                        String rentalType;
                        do {
                            System.out.println("Rental type");
                            rentalType = sc.nextLine();
                        } while (!Regex.checkRegexRetalType(rentalType));
                        System.out.println("Free service: ");
                        String freeService32 = sc.nextLine();
                        String numbOfUse32;
                        do {
                            System.out.println("Number of uses: ");
                            numbOfUse32 = sc.nextLine();
                        } while (!Regex.checkRegexNumbOfUse(numbOfUse32));
                        Facility room = new Room(id32, nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, freeService32);
                        facilityService.add(room, numbOfUse32);
                    } else {
                        String id32;
                        do {
                            System.out.println("Input ID");
                            id32 = sc.nextLine();
                        } while (!Regex.checkRegexIDVIlla(id32));
                        String nameService32;
                        do {
                            System.out.println("New name service: ");
                            nameService32 = sc.nextLine();
                        } while (!Regex.checkRegexNameService(nameService32));
                        String usableAre32;
                        do {
                            System.out.println("Usable are: ");
                            usableAre32 = sc.nextLine();
                        } while (!Regex.checkRegexRegexArea(usableAre32));
                        String rentalCost32;
                        do {
                            System.out.println("Rental costs");
                            rentalCost32 = sc.nextLine();
                        } while (!Regex.checkRegexRentalCost(rentalCost32));
                        String maxNumbOfPeople32;
                        do {
                            System.out.println("Max number of people: ");
                            maxNumbOfPeople32 = sc.nextLine();
                        } while (!Regex.checkRegexMaxPeople(maxNumbOfPeople32));
                        String rentalType;
                        do {
                            System.out.println("Rental type");
                            rentalType = sc.nextLine();
                        } while (!Regex.checkRegexRetalType(rentalType));
                        System.out.println("Room standard: ");
                        String roomStandard32 = sc.nextLine();
                        System.out.println("Pool area: ");
                        int poolArea32 = Integer.parseInt(sc.nextLine());
                        System.out.println("Floors: ");
                        int floors32 = Integer.parseInt(sc.nextLine());
                        String numbOfUse32;
                        do {
                            System.out.println("Number of uses: ");
                            numbOfUse32 = sc.nextLine();
                        } while (!Regex.checkRegexNumbOfUse(numbOfUse32));
                        Facility villa = new Villa(id32, nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, roomStandard32, poolArea32, floors32);
                        facilityService.add(villa, numbOfUse32);
                    }
                case 3:
                    facilityService.displayFacilityMaintenace();
                    break;
            }
        } while (choose3 != 4);
    }
}
