package ss3.baitap;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 2 chiều: ");
        int m= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập độ dài 1 phần tử của mảng 2 chiều: ");
        int n= Integer.parseInt(sc.nextLine());
        int arr[][]=new int[m][n];
        int max=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Nhập phần tử arr["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(sc.nextLine());
                if (i==0&& j==0){
                    max=Integer.parseInt(String.valueOf(arr[i][j]));
                }
                if (arr[i][j]> max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
    }
}
