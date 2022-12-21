package ss15.bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleException triangleException = new TriangleException();
        System.out.println("Nhập cạnh a: ");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b: ");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c: ");
        double c = Integer.parseInt(sc.nextLine());
        try {
            triangleException.checkTriangleException(a, b, c);
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void checkTriangleException(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Lỗi: Cạnh tam giác phải dương");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Cạnh tam giác không hợp lệ!");
        } else {
            System.out.println("Cạnh tam giác hợp lệ");
        }
    }
}
