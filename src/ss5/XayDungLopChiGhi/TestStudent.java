package ss5.XayDungLopChiGhi;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Truong");
        student.setClasses("C1022G1");
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
    }
}
