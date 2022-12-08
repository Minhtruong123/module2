package ss5.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("Area is: " + circle.getArea());
    }
}
