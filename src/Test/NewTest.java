package Test;


import java.util.*;

public class NewTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            str2 += str.charAt(i) + "";
            int a = Integer.parseInt(str.charAt(i) + "");
            int b = Integer.parseInt(str.charAt(i + 1) + "");
            if (a % 2 == 0 && b % 2 == 0) {
                str2 += "-";
            }
        }
        System.out.println(str2 + str.charAt(str.length() - 1));
    }
}
