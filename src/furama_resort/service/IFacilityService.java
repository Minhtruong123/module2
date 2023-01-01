package furama_resort.service;

import furama_resort.model.facility.Facility;
import furama_resort.model.facility.Room;
import furama_resort.model.facility.Villa;

public interface IFacilityService {
    void displayFacility();

    void displayFacilityMaintenace();

    void addRoom(Facility room, String numb);

    void addVilla(Villa villa, String numb);
}
