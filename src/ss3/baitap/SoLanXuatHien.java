package ss3.baitap;

import java.util.Scanner;

public class SoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        System.out.println("Nhập 1 kí tự: ");
        char find = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == find) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện: " + count);
    }
}
