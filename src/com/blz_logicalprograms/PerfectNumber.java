package com.blz_logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println(n + " Is a perfect number");
        } else {
            System.out.println(n + " Is not a perfect number");
        }
    }
}
