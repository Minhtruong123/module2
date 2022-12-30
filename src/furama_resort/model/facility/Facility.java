package furama_resort.model.facility;

public abstract class Facility {
    private String id;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maxNumOfPeople;
    private String retalType;

    public Facility() {
    }

    public Facility(String id, String serviceName, String usableArea, String rentalCosts, String maxNumOfPeople, String retalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumOfPeople = maxNumOfPeople;
        this.retalType = retalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxNumOfPeople() {
        return maxNumOfPeople;
    }

    public void setMaxNumOfPeople(String maxNumOfPeople) {
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
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxNumOfPeople=" + maxNumOfPeople +
                ", retalType='" + retalType + '\'' +
                '}';
    }
}
