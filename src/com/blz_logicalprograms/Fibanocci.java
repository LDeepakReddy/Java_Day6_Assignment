package com.blz_logicalprograms;

import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {
        System.out.println("Enter the number you to print the series");
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        int First_number = 0;
        int Second_number = 1;
        System.out.println("Fibanocci series till " + N);
        for (int i = 0; i <= N; i++) {
            System.out.println(First_number + " ");
            int Next_number = First_number + Second_number;
            First_number = Second_number;
            Second_number = Next_number;
        }
    }
}