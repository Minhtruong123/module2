package furama_resort.model.person;

public class Employee extends Person {
    private String gender;
    private String identityCard;
    private String email;
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String gender, String identityCard, String email, String level, String position, String salary) {
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String phoneNumber, String gender, String identityCard, String email, String level, String position, String salary) {
        super(id, name, dateOfBirth, phoneNumber);
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "gender=" + gender +
                ", identityCard='" + identityCard + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "} ";
    }
}
