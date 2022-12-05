package ss3.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.println("Nhập số lượng phần tử bạn muốn: ");
        String n = sc.nextLine();
        arr = new int[Integer.parseInt(n)];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập số bạn muốn thêm vào: ");
        int find = sc.nextInt();
        System.out.println("Nhập vị trí bạn muốn: ");
        int index = sc.nextInt();
        arr = Arrays.copyOf(arr, arr.length + 1);
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = find;
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
