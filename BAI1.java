/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_letan_2681;

import java.util.Scanner;

public class BAI1 {

    public static int check(int n) {
        if (n < 0) {
            System.out.println("SO AM");
        } else if (n > 0) {
            System.out.println("SO DUONG");
        } else {
            System.out.println("SO 0");
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
