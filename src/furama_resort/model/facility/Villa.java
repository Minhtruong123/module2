package furama_resort.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String floors;

    public Villa() {
    }

    public Villa(String roomStandard, String poolArea, String floors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String id, String serviceName, String usableArea, String rentalCosts, String maxNumOfPeople, String retalType, String roomStandard, String poolArea, String floors) {
        super(id, serviceName, usableArea, rentalCosts, maxNumOfPeople, retalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + roomStandard +
                "," + poolArea +
                "," + floors;
    }
}
