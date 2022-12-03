package ss2;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isoceles triangle");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                for (i=0;i<5;i++){
                    for (j=0;j<8;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (i=1;i<=5;i++){
                    for (j=1;j<=i;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println();
                for (i=1;i<=5;i++){
                    for (j=1;j<=5-i+1;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println();
                for (i=1;i<=5;i++){
                    for (j=1;j<=5-i;j++){
                        System.out.print(' ');
                    }
                    for (j=1;j<=i;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                System.out.println();
                for (i=1;i<=5;i++){
                    for (j=1;j<=i-1;j++){
                        System.out.print(' ');
                    }
                    for (j=1;j<=5-i+1;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (i=1;i<=5;i++){
                    for (j=1;j<=5-i;j++){
                        System.out.print(' ');
                    }
                    for (j=1;j<=i;j++){
                        System.out.print('*');
                    }
                    for (j=1;j<=i-1;j++){
                        System.out.print('*');
                    }
                    System.out.println();
                }
        }
    }
}
