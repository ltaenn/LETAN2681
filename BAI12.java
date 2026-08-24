package letan_2681.Lec05_loops;

import java.util.Random;
import java.util.Scanner;

public class BAI12 {

    public static int taoCauHoi() {
        Random rand = new Random();
        int n = rand.nextInt(4) + 2;
        int sum = 0;
        System.out.print("Question: ");
        for (int i = 1; i <= n; i++) {
            int numberRand = rand.nextInt(10) + 1;
            sum = sum + numberRand;
            System.out.print(numberRand);
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.print(" = ");
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wrong = 0;
        int score = 0;
        while (wrong < 3) {
            int sum = taoCauHoi();
            int answer = input.nextInt();
            if (answer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer: " + sum);
                wrong++;
            }
        }
        System.out.println("End game!!!");
        System.out.println("sorce: " + score);
    }
}
