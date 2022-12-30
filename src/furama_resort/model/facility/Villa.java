package furama_resort.model.facility;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String roomStandard, int poolArea, int floors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String id, String serviceName, String usableArea, String rentalCosts, String maxNumOfPeople, String retalType, String roomStandard, int poolArea, int floors) {
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

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                '}';
    }
}
