package ss19.bai_tap.validate_ten_lop_hoc;

import java.util.Scanner;

public class ValidateClassName {
    private static final String NAME_CLASS= "^[CAP]\\d{4}[GHIKLM]$";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên lớp học: ");
        String str=sc.nextLine();
        if (str.matches(NAME_CLASS)){
            System.out.println("Tên lớp hợp lệ");
        } else {
            System.out.println("Tên lớp không hợp lệ");
        }
    }
}
