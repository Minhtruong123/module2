package ss4.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập c: ");
        int c = Integer.parseInt(sc.nextLine());

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.a == 0) {
            System.out.println("x = " + (-quadraticEquation.c / quadraticEquation.b));
        } else {
            if (quadraticEquation.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-quadraticEquation.b / (2 * quadraticEquation.a)));
            } else {
                System.out.println("Nghiệm x1 = " + quadraticEquation.getRoot1());
                System.out.println("Nghiệm x2 = " + quadraticEquation.getRoot2());
            }
        }
    }
}
