package ss15.bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleExceptionCheck triangleExceptionCheck = new TriangleExceptionCheck();

        try {
            System.out.println("Nhập cạnh a: ");
            double a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh b: ");
            double b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh c: ");
            double c = Integer.parseInt(sc.nextLine());
            try {
                triangleExceptionCheck.checkTriangleException(a, b, c);
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Nhập sai!");
        }
        sc.close();
    }
}
