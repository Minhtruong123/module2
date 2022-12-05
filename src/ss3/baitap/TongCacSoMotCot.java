package ss3.baitap;

import java.util.Scanner;

public class TongCacSoMotCot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Độ dài mảng: ");
        int m= Integer.parseInt(sc.nextLine());
        System.out.println("Độ dài của 1 phần tử: ");
        int n=Integer.parseInt(sc.nextLine());
        int arr[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("Nhập phần tử arr["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Nhập vị trí cột bạn muốn: ");
        int column=Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i=0;i<m;i++){
            sum+=arr[i][column];
        }
        System.out.println("Tổng cột: "+sum);
    }
}
