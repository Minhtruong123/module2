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
        Map<Facility, Integer> mapRoom1 = new LinkedHashMap<>();
        mapRoom1.put(room, Integer.valueOf(numb));
        RoomRnW.writeFile(mapRoom1);
        mapRoom1.clear();
    }

    public void addVilla(Villa villa, String numb) {
        Map<Facility, Integer> mapVilla1 = new LinkedHashMap<>();
        mapVilla1.put(villa, Integer.valueOf(numb));
        VillaRnW.writeFile(mapVilla1);
        mapVilla1.clear();
    }
}
