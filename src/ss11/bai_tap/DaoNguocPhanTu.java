package ss11.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Đảo ngược mảng số nguyên
        Stack<Integer> stackArray = new Stack<>();
        System.out.println("Số phần tử trong mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
            stackArray.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackArray.pop();
        }
        System.out.println("Mảng đảo ngược: ");
        System.out.println(Arrays.toString(arr));

        //Đảo ngược chuỗi
        Stack<String> stringStack = new Stack<>();
        System.out.println("Nhập chuỗi: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i) + "");
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stringStack.pop());
        }
    }
}
