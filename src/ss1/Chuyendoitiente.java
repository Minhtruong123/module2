package ss1;

import java.util.Scanner;

public class Chuyendoitiente {
    public static void main(String[] args) {
        double usd;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số tiền USD: ");
        usd=sc.nextDouble();
        double vnd= usd* 23000;
        System.out.println("Giá trị VND: "+vnd);
    }
}
