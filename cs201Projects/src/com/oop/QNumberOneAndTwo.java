package com.oop;

import java.util.Scanner;

public class QNumberOneAndTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("please inter the first input");
            int num1 = scanner.nextInt();
            System.out.println("please inter the next input");
            int num2 = scanner.nextInt();
            if(num1 <= 0 || num2 <= 0){
                throw new IllegalArgumentException("Invalid Input");
            }
            int sum = num1 + num2;
            System.out.println("Sum = "+sum);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}











