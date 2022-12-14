package ss4.thuchanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String display() {
        return "Rectangle{" + "width =" + width + ", height =" + height + "}";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the height: ");
        int height = Integer.parseInt(sc.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Rectangle: " + rectangle.display());
        System.out.println("Area is: " + rectangle.getArea());
        System.out.println("Perimeter is: " + rectangle.getPerimeter());
    }
}
