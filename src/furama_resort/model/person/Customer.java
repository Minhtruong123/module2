package furama_resort.model.person;

public class Customer extends Person{
    private String gender;
    private String identityCard;
    private String email;
    private String type;
    private String address;

    public Customer() {
    }

    public Customer(String gender, String identityCard, String email, String type, String address) {
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.type = type;
        this.address = address;
    }

    public Customer(String id, String name, String dateOfBirth, String phoneNumber, String gender, String identityCard, String email, String type, String address) {
        super(id, name, dateOfBirth, phoneNumber);
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.type = type;
        this.address = address;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "gender=" + gender +
                ", identityCard='" + identityCard + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                "} " ;
    }
}
