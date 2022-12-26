package ss19.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class ValidateSoDienThoai {
    private static final String NUMBER_PHONE = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện thoại");
        String str = sc.nextLine();
        if (str.matches(NUMBER_PHONE)) {
            System.out.println("Số hợp lệ");
        } else {
            System.out.println("Số không hợp lệ");
        }
    }
}

