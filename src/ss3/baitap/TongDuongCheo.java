package ss3.baitap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int lengthArr=Integer.parseInt(sc.nextLine());
        int arr[][]=new int[lengthArr][lengthArr];
        int sum=0;
        for (int i=0;i<lengthArr;i++){
            for (int j=0;j<lengthArr;j++){
                System.out.println("Nhập phần tử arr["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(sc.nextLine());
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính của mảng là: "+sum);
    }
}
