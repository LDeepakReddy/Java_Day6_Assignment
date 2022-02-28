package com.blz_logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number which you want to reverse ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int rem;
        int rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;

        }
        System.out.println("Reverse num of given input is " + rev);
    }
}
