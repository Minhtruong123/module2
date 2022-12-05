package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        System.out.println("Nhập độ dài mảng thứ nhất: ");
        int doDai1=sc.nextInt();
        arr1=new int[doDai1];
        for (int i=0;i<doDai1;i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr1[i]=sc.nextInt();
        }
        System.out.println("Nhập độ dài mảng thứ hai: ");
        int doDai2=sc.nextInt();
        arr2=new int[doDai2];
        for (int i=0;i<doDai2;i++){
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr2[i]=sc.nextInt();
        }
        arr1= Arrays.copyOf(arr1,arr1.length+arr2.length);
        for (int i=0;i<arr2.length;i++){
            arr1[i+doDai1]=arr2[i];
        }
        for (int i:arr1){
            System.out.print(i+",");
        }
    }
}
