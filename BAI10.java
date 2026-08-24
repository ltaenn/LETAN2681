package letan_2681.Lec05_loops;

import java.util.Random;
import java.util.Scanner;

public class bai10 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int RN = rand.nextInt(20) + 1;
        int count = 0;
        int TR = 0;
        do {
            System.out.println("enter your anwser: ");
            TR = input.nextInt();
            if (TR < RN) {
                System.out.println("so be hon so can tim ");
            } else if (TR > RN) {
                System.out.println("so lon hon so can tim ");
            } else {
                System.out.println("chuc mung ban da doan dung !!!!");
            }
            count++;
        } while (TR != RN);
        System.out.println("count yout anwser: " + count);
        System.out.println("number random: " + RN);

    }

}
