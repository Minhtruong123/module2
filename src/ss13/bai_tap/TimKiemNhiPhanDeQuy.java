package ss13.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemNhiPhanDeQuy {
    private static int binarySearch(int[] arr, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) return mid;
            else if (value > arr[mid]) return binarySearch(arr, mid + 1, right, value);
            else return binarySearch(arr, left, mid - 1, value);
        } else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 44, 73, 5, 3, 6, 4, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử cần tìm");
        int value = Integer.parseInt(sc.nextLine());
        int check = binarySearch(arr, 0, 7, value);
        if (check != (-1)) {
            System.out.println("Số cần tìm ở vị trí " + check);
        } else System.out.println("Không tìm thấy giá trị" + value);
    }
}
