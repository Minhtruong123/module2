package furama_resort.service;

import furama_resort.model.facility.Facility;

public interface IFacilityService {
    void displayFacility();

    public void displayFacilityMaintenace();

    void add(Facility facility, int numb);


}
