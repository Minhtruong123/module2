package ss13.bai_tap;

import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        int max = 0;
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            String strTemp = str.charAt(i) + "";
            int count = 0;
            for (int j = i; j < str.length() - 1; j++) {
                int value1 = str.charAt(j);
                int value2 = str.charAt(j + 1);
                if (value1 < value2) {
                    count++;
                    strTemp += str.charAt(j + 1);
                }
            }
            if (count > max) {
                str2 = strTemp;
                max = count;
            }
        }
        System.out.println(str2);
    }
}
