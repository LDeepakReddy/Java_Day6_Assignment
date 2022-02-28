package com.blz_logicalprograms;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a range  to check if they are prime or not");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int count = 0;                 //number of divisors
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.println(+j + " is a prime number");
            else System.out.println(+j + " is not prime number");
        }
    }
}