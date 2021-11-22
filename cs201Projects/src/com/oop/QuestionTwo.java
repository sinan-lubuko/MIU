package com.oop;

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second  number");
            int num2 = scanner.nextInt();
            System.out.println("Enter the third number");
            int num3 = scanner.nextInt();
            System.out.println(compare(num1, num2, num3));
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static boolean compare ( int num1, int num2, int num3) {
        int sum = 0;
        sum = num1 + num2;
        if (sum > num3) {
            return true;
        } else {
            return false;
        }
    }
}
