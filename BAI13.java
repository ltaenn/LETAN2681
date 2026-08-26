package btvn_letan_2681;

import java.util.Scanner;

public class BAI13 {

    public static int tinhTong(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static float tinhTrungBinh(int sum, int n) {
        return (float) sum / n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int sum = tinhTong(arr);
        float average = tinhTrungBinh(sum, n);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
