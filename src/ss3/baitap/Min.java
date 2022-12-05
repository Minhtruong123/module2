package ss3.baitap;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử: ");
        int length1=Integer.parseInt(sc.nextLine());
        int arr[]=new int[length1];
        int min = 0;
        for (int i=0;i<length1;i++){
            System.out.println("Nhập phần tử thứ "+i);
            arr[i]=Integer.parseInt(sc.nextLine());
            if (i==0){
                min=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: "+min);
    }
}
