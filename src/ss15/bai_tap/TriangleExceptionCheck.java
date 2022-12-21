package ss15.bai_tap;


public class TriangleExceptionCheck {
    public void checkTriangleException(double a, double b, double c) throws IllegalTriangleException{
        if (a+b <=c|| a+c<=b|| b+c<=a){
            throw new IllegalTriangleException("Lỗi: Cạnh tam giác không hợp lệ!");
        }
        else {
            System.out.println("Cạnh tam giác hợp lệ");
        }
    }
}
