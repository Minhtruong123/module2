package furama_resort.model.facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String usableArea, String rentalCosts, String maxNumOfPeople, String retalType, String freeService) {
        super(id, serviceName, usableArea, rentalCosts, maxNumOfPeople, retalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public String toString1() {
        return super.toString1() +
                "," + freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
