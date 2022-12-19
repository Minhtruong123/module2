package ss13.thuc_hanh;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class XuatHienNhieuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        System.out.println("Nhập vào chuỗi");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (stringIntegerMap.containsKey(str.charAt(i) + "")) {
                stringIntegerMap.put(str.charAt(i) + "", stringIntegerMap.get(str.charAt(i) + "") + 1);
            } else stringIntegerMap.put(str.charAt(i) + "", 1);
        }
        int max = -1;
        String temp = "";
        for (String key : stringIntegerMap.keySet()) {
            if (stringIntegerMap.get(key) > max) {
                max = stringIntegerMap.get(key);
                temp = key;
            }
        }
        System.out.println(temp + " xuất hiện " + max + " lần");
    }
}
