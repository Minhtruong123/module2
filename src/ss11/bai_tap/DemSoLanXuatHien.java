package ss11.bai_tap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Map<String, Integer> integerStringMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (integerStringMap.containsKey(str.charAt(i) + "")) {
                integerStringMap.put(str.charAt(i) + "", integerStringMap.get(str.charAt(i) + "") + 1);
            } else {
                integerStringMap.put(str.charAt(i) + "", 1);
            }
        }
        System.out.println("Số lần xuất hiện của các từ: ");
        System.out.println(integerStringMap);
    }
}
