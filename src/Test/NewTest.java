package Test;


import java.util.Scanner;

public class NewTest {
    String solution(String arg1) {
        String str = "";
        for (int i = 0; i < arg1.length()-1; i++) {
            str += arg1.charAt(i) + "";
            if ((arg1.charAt(i + 1) + "").equals((arg1.charAt(i + 1) + "").toUpperCase())) {
                str += " ";
            }
        }
        return str.toLowerCase()+arg1.charAt(arg1.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        NewTest newTest = new NewTest();
        System.out.println(newTest.solution(str));
    }
}
