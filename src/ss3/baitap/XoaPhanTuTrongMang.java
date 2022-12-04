package ss3.baitap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        System.out.println("Số lượng phần tử bạn muốn nhập: ");
        String DoDai= sc.nextLine();
        array = new int[Integer.parseInt(DoDai)];
        for (int i=0;i<Integer.parseInt(DoDai);i++){
            System.out.println("Phần tử thứ "+(i+1));
            array[i]= sc.nextInt();
        }
        System.out.println("Số bạn muốn xóa: ");
        int find=sc.nextInt();
        for (int i=0;i<array.length;i++){
            if (array[i]==find) {
                array[i]=0;
            }
        }
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]==0){
                    int temp= array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
