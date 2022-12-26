package furama_resort.model.person;

public class Employee extends Person {
    private boolean gender;
    private int identityCard;
    private String email;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(boolean gender, int identityCard, String email, String level, String position, int salary) {
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirth, int phoneNumber, boolean gender, int identityCard, String email, String level, String position, int salary) {
        super(id, name, dateOfBirth, phoneNumber);
        this.gender = gender;
        this.identityCard = identityCard;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "gender=" + gender +
                ", identityCard=" + identityCard +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
