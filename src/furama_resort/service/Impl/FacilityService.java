package furama_resort.service.Impl;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;
import furama_resort.model.facility.Villa;
import furama_resort.service.IFacilityService;
import furama_resort.util.RoomRnW;
import furama_resort.util.VillaRnW;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    public static Map<Facility, Integer> mapRoom = new LinkedHashMap<>();
    public static Map<Facility, Integer> mapVilla = new LinkedHashMap<>();

    static {
        mapRoom.put(new Room("SVRO-1234", "Room", "30", "1000", "10", "Day", "Landry"), 1);
        mapRoom.put(new Room("SVRO-1324", "Room", "35", "2000", "8", "Week", "Landry"), 6);
        mapVilla.put(new Villa("SVVL-1234", "Villa", "39", "4000", "10", "Day", "Diamond", "30", "3"), 2);
        mapVilla.put(new Villa("SVVL-1324", "Villa", "36", "3000", "10", "Day", "Diamond", "50", "4"), 5);
        RoomRnW.writeFile(mapRoom);
        VillaRnW.writeFile(mapVilla);
    }

    public void displayFacility() {
        Map<Facility, Integer> mapRoom1 = RoomRnW.readFile();
        Map<Facility, Integer> mapVilla1 = VillaRnW.readFile();
        for (Map.Entry<Facility, Integer> entry : mapRoom1.entrySet()) {
            System.out.print(entry.getKey().getId());
            System.out.println(": Được sử dụng: " + entry.getValue());
        }
        for (Map.Entry<Facility, Integer> entry : mapVilla1.entrySet()) {
            System.out.print(entry.getKey().getId());
            System.out.println(": Được sử dụng: " + entry.getValue());
        }
    }

    public void displayFacilityMaintenace() {
        Map<Facility, Integer> mapRoom1 = RoomRnW.readFile();
        Map<Facility, Integer> mapVilla1 = VillaRnW.readFile();
        for (Map.Entry<Facility, Integer> entry : mapRoom1.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey());
            }
        }
        for (Map.Entry<Facility, Integer> entry : mapVilla1.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey());
            }
        }
    }

    public void addRoom(Facility room, String numb) {
        Map<Facility, Integer> mapRoom1 = RoomRnW.readFile();
        mapRoom1.put(room, Integer.valueOf(numb));
        RoomRnW.writeFile(mapRoom1);
    }

    public void addVilla(Villa villa, String numb) {
        Map<Facility, Integer> mapVilla1 = VillaRnW.readFile();
        mapVilla1.put(villa, Integer.valueOf(numb));
        VillaRnW.writeFile(mapVilla1);
    }
}
