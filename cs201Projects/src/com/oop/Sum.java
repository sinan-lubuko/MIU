package com.oop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please inter the first input");
        num1 = scanner.nextInt();
        System.out.println("please inter the next input");
        num2 = scanner.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }

}