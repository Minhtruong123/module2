package furama_resort.model.facility;

public abstract class Facility {
    private String serviceName;
    private int usableArea;
    private int rentalCosts;
    private int maxNumOfPeople;
    private String retalType;

    public Facility() {
    }

    public Facility(String serviceName, int usableArea, int rentalCosts, int maxNumOfPeople, String retalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumOfPeople = maxNumOfPeople;
        this.retalType = retalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumOfPeople() {
        return maxNumOfPeople;
    }

    public void setMaxNumOfPeople(int maxNumOfPeople) {
        this.maxNumOfPeople = maxNumOfPeople;
    }

    public String getRetalType() {
        return retalType;
    }

    public void setRetalType(String retalType) {
        this.retalType = retalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", retalType='" + retalType + '\'' +
                '}';
    }
}
