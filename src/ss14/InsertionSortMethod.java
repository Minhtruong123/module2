package ss14;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortMethod {
    void sort(int list[]) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử bạn muốn: ");
        int doDai = Integer.parseInt(sc.nextLine());
        int arr[] = new int[doDai];
        for (int i = 0; i < doDai; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        InsertionSortMethod insertionSortMethod = new InsertionSortMethod();
        insertionSortMethod.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
