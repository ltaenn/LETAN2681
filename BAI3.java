package btvn_letan_2681;

import java.util.Scanner;

public class BAI3 {

    public static int check(double n) {
        if (n > 5) {
            System.out.println("dat");
        } else {
            System.out.println("khong dat");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double n = input.nextDouble();
        check(n);
    }
}
