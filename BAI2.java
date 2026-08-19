package btvn_letan_2681;

import java.util.Scanner;

public class BAI2 {

    public static int check(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "la so chan");
        } else {
            System.out.println(n + "la so le");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        check(n);
    }
}
