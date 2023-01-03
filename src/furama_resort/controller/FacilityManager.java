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
        String choose3;
        do {
            facilityManager.displayMiniMenu3();
            do {
                System.out.println("Input");
                choose3 = sc.nextLine();
            } while (!Regex.isNum(choose3));
            switch (choose3) {
                case "1":
                    facilityService.displayFacility();
                    break;
                case "2":
                    System.out.println("New room or villa (1:Room, 2:Villa)");
                    int numb32 = Integer.parseInt(sc.nextLine());
                    if (numb32 == 1) {
                        String id32;
                        do {
                            System.out.println("Input ID");
                            id32 = sc.nextLine();
                            if (!Regex.checkRegexIDRoom(id32)){
                                System.err.println("Not wrong format. Input again");
                            }
                        } while (!Regex.checkRegexIDRoom(id32));
                        String nameService32;
                        do {
                            System.out.println("New name service: ");
                            nameService32 = sc.nextLine();
                            if (!Regex.checkRegexNameService(nameService32)){
                                System.err.println("Wrong name. Input again");
                            }
                        } while (!Regex.checkRegexNameService(nameService32));
                        String usableAre32;
                        do {
                            System.out.println("Usable are: (>30)");
                            usableAre32 = sc.nextLine();
                            if (!Regex.checkRegexRegexArea(usableAre32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexRegexArea(usableAre32));
                        String rentalCost32;
                        do {
                            System.out.println("Rental costs");
                            rentalCost32 = sc.nextLine();
                            if (!Regex.checkRegexRentalCost(rentalCost32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexRentalCost(rentalCost32));
                        String maxNumbOfPeople32;
                        do {
                            System.out.println("Max number of people: ");
                            maxNumbOfPeople32 = sc.nextLine();
                            if (!Regex.checkRegexMaxPeople(maxNumbOfPeople32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexMaxPeople(maxNumbOfPeople32));
                        String rentalType;
                        do {
                            System.out.println("Rental type");
                            rentalType = sc.nextLine();
                            if (!Regex.checkRegexRetalType(rentalType)){
                                System.err.println("Wrong type. Input again");
                            }
                        } while (!Regex.checkRegexRetalType(rentalType));
                        System.out.println("Free service: ");
                        String freeService32 = sc.nextLine();
                        String numbOfUse32;
                        do {
                            System.out.println("Number of uses: ");
                            numbOfUse32 = sc.nextLine();
                            if (!Regex.checkRegexNumbOfUse(numbOfUse32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexNumbOfUse(numbOfUse32));
                        Facility room = new Room(id32, nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, freeService32);
                        facilityService.addRoom(room, numbOfUse32);
                    } else {
                        String id32;
                        do {
                            System.out.println("Input ID");
                            id32 = sc.nextLine();
                            if (!Regex.checkRegexIDVIlla(id32)){
                                System.err.println("Wrong format. Input again");
                            }
                        } while (!Regex.checkRegexIDVIlla(id32));
                        String nameService32;
                        do {
                            System.out.println("New name service: ");
                            nameService32 = sc.nextLine();
                            if (!Regex.checkRegexNameService(nameService32)){
                                System.err.println("Wrong name. Input again");
                            }
                        } while (!Regex.checkRegexNameService(nameService32));
                        String usableAre32;
                        do {
                            System.out.println("Usable are: ");
                            usableAre32 = sc.nextLine();
                            if (!Regex.checkRegexRegexArea(usableAre32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexRegexArea(usableAre32));
                        String rentalCost32;
                        do {
                            System.out.println("Rental costs");
                            rentalCost32 = sc.nextLine();
                            if (!Regex.checkRegexRentalCost(rentalCost32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexRentalCost(rentalCost32));
                        String maxNumbOfPeople32;
                        do {
                            System.out.println("Max number of people: ");
                            maxNumbOfPeople32 = sc.nextLine();
                            if (!Regex.checkRegexMaxPeople(maxNumbOfPeople32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexMaxPeople(maxNumbOfPeople32));
                        String rentalType;
                        do {
                            System.out.println("Rental type");
                            rentalType = sc.nextLine();
                            if (!Regex.checkRegexRetalType(rentalType)){
                                System.err.println("Wrong type. Input again");
                            }
                        } while (!Regex.checkRegexRetalType(rentalType));
                        System.out.println("Room standard: ");
                        String roomStandard32 = sc.nextLine();
                        System.out.println("Pool area: ");
                        String poolArea32 = sc.nextLine();
                        System.out.println("Floors: ");
                        String floors32 = sc.nextLine();
                        String numbOfUse32;
                        do {
                            System.out.println("Number of uses: ");
                            numbOfUse32 = sc.nextLine();
                            if (!Regex.checkRegexNumbOfUse(numbOfUse32)){
                                System.err.println("Wrong number. Input again");
                            }
                        } while (!Regex.checkRegexNumbOfUse(numbOfUse32));
                        Villa villa = new Villa(id32, nameService32, usableAre32, rentalCost32, maxNumbOfPeople32, rentalType, roomStandard32, poolArea32, floors32);
                        facilityService.addVilla(villa, numbOfUse32);
                    }
                    break;
                case "3":
                    facilityService.displayFacilityMaintenace();
                    break;
            }
        } while (Integer.parseInt(choose3) != 4);
    }
}
