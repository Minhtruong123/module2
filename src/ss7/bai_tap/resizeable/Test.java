package ss7.bai_tap.resizeable;

import ss4.thuchanh.Rectangle;

public class Test {
    public static void main(String[] args) {
        double percent;
        Circle[] circles = new Circle[3];
        Recctangle[] recctangles = new Recctangle[2];
        Square[] squares = new Square[3];

        circles[0] = new Circle(true, 5);
        circles[1] = new Circle(true, 4);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        circles[0].resize(percent);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        circles[1].resize(percent);
        System.out.println();

        recctangles[0] = new Recctangle(true, 3, 4);
        recctangles[1] = new Recctangle(true, 5, 6);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        recctangles[0].resize(percent);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        recctangles[1].resize(percent);
        System.out.println();

        squares[0] = new Square(true, 3);
        squares[1] = new Square(true, 4);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        squares[0].resize(percent);
        percent = Math.round(Math.random() * 100);
        System.out.println("Với " + percent + "%");
        squares[1].resize(percent);
    }
}
