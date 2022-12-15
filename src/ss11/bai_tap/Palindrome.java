package ss11.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        Queue<String> stringQueue = new LinkedList<>();
        Queue<String> stringQueue2 = new LinkedList<>();
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stringQueue.offer(str.charAt(i) + "");
            stringQueue2.offer(str.charAt(str.length() - i - 1) + "");
            if (!stringQueue2.remove().equals(stringQueue.remove())) {
                check = false;
                break;
            }
        }
        if (check) System.out.println("Đó là chuỗi Palindrome");
        else System.out.println("Đó không phải là chuỗi Palindrome");
    }
}
