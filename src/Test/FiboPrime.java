package Test;

import java.util.Arrays;
import java.util.Scanner;

public class FiboPrime {
    public static boolean isPrime(int k) {
        boolean kt = true;
        if (k < 2) {
            kt = false;
        } else {
            for (int i = 2; i <= Math.sqrt(k); i++) {
                if (k % i == 0) {
                    kt = false;
                    break;
                }
            }
        }
        return kt;
    }

    public static int fib(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 0;
        for (i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Số phần tử bạn muốn: ");
        int n = Integer.parseInt(sc.nextLine());
        arr = new int[n];
        int j = 1;
        int i = 0;
        while (i < n) {
            if (isPrime(fib(j + 1))) {
                arr[i] = fib(j + 1);
                i++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
