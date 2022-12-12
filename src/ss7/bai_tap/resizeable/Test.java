package ss7.bai_tap.resizeable;

import ss4.thuchanh.Rectangle;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries= new Geometry[3];
        geometries[0] = new Circle(true,3);
        geometries[1]= new Recctangle(false,5,10);
        geometries[2]= new Square(true,4);
        for (Geometry geometry:geometries){
            if (geometry instanceof Circle){
                Resizeable squareInterface = (Circle) geometry;
                System.out.println("Diện tích ban đầu là: "+squareInterface.getArea());
                double percent = Math.floor(Math.random()*100+1);
                System.out.println("Tỉ lệ phần trăm tăng: "+percent+'%');
                squareInterface.resize(percent);
            }
            System.out.println();
            if (geometry instanceof Recctangle){
                Resizeable recctangleInterface = (Recctangle) geometry;
                System.out.println("Diện tích ban đầu là: "+recctangleInterface.getArea());
                double percent = Math.floor(Math.random()*100+1);
                System.out.println("Tỉ lệ phần trăm tăng: "+percent+'%');
                recctangleInterface.resize(percent);
            }
            System.out.println();
            if (geometry instanceof Square){
                Resizeable squareInterface = (Square) geometry;
                System.out.println("Diện tích ban đầu là: "+squareInterface.getArea());
                double percent = Math.floor(Math.random()*100+1);
                System.out.println("Tỉ lệ phần trăm tăng: "+percent+'%');
                squareInterface.resize(percent);
            }
        }
    }
}
