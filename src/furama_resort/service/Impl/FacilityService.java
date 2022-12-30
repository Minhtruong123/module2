package furama_resort.service.Impl;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;
import furama_resort.model.facility.Villa;
import furama_resort.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    static Map<Facility,String> map = new LinkedHashMap();
    static Map<Facility,String> mapMaintenance = new LinkedHashMap<>();
    static {
        map.put(new Room("SVRO-4561","Twin bedroom","100","1000","4","day","laundry"),"2");
        map.put(new Room("SVRO-4521","Big bedroom","200","2000","6","day","laundry"),"4");
        map.put(new Villa("SVVL-3661","Single villa","200","5000","10","week","private swimming pool",50,3),"2");
        mapMaintenance.put(new Villa("SVVL-3251","Single villa","200","5000","10","week","private swimming pool",50,3),"5");
    }

    public void displayFacility(){
        for (Facility facility:map.keySet()){
            System.out.print(facility);
            System.out.println("Được sử dụng: "+map.get(facility));
        }
    }

    public void displayFacilityMaintenace(){
        for (Facility facility:mapMaintenance.keySet()){
            System.out.print(facility);
            System.out.println(mapMaintenance.get(facility));
        }
    }

    public void add(Facility facility, String numb){
        if (Integer.parseInt(numb)<5){
            map.put(facility,numb);
        }else {
            mapMaintenance.put(facility,numb);
        }
    }
}
