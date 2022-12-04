package ss3.baitap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử bạn muốn: ");
//        String n=sc.nextLine();
        int[] array=new int[3];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        array[3]=12;
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
