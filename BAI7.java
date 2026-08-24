package letan_2681.Lec05_loops;

import java.util.Scanner;

public class BAI7 {

    public static void ck(double n, double sum, double count) {

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            n = input.nextDouble();
            if (n != 0) {
                sum = sum + n;
                count++;
            }
        } while (n != 0);
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);
        System.out.println("avg: " + sum / count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        System.out.println("Enter a number: ");
        double n = input.nextDouble();
        if (n == 0) {
            System.out.println("do not data!");
            return;
        }
        sum = n;
        count++;
        ck(n, sum, count);
    }
}
