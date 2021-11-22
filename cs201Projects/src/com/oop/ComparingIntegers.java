package com.oop;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the first number");
        num1 = scanner.nextInt();
        System.out.println("Enter the second  number");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number");
        num3 = scanner.nextInt();
        System.out.println(Compare(num1,num2,num3));
    }
    public static boolean Compare(int num1, int num2, int num3) {
        int sum = 0;
        sum = num1 + num2;
        if (sum > num3) {
            return true;
        } else {
            return false;

        }
    }
}







