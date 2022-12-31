package furama_resort.service.Impl;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;
import furama_resort.model.facility.Villa;
import furama_resort.service.IFacilityService;
import furama_resort.util.RoomRnW;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {

    public void displayFacility(){
        Map<Facility,Integer> mapRoom= RoomRnW.readFile();
        Map<Facility,Integer> mapVilla= Villa.readFile();
        for (Facility facility:mapRoom.keySet()){
            System.out.print(facility);
            System.out.println("Được sử dụng: "+mapRoom.get(facility));
        }
        for (Facility facility:mapVilla.keySet()){
            System.out.print(facility);
            System.out.println("Được sử dụng: "+mapVilla.get(facility));
        }
    }

    public void displayFacilityMaintenace(){
        Map<Facility,Integer> mapRoom= RoomRnW.readFile();
        Map<Facility,Integer> mapVilla= Villa.readFile();
        for (Facility facility:mapRoom.keySet()){
            if (mapRoom.get(facility)>=5){
                System.out.println(facility);
            }
        }
        for (Facility facility:mapRoom.keySet()){
            if (mapVilla.get(facility)>=5){
                System.out.println(facility);
            }
        }
    }

    public void add(Facility facility, String numb){
        Map<Facility,Integer> mapRoom= RoomRnW.readFile();
        Map<Facility,Integer> mapVilla= Villa.readFile();
        if (Integer.parseInt(numb)<5){
            map.put(facility,numb);
        }else {
            mapMaintenance.put(facility,numb);
        }
    }
}
