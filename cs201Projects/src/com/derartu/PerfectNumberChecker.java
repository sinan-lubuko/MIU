package com.derartu;

import java.util.Scanner;

public class PerfectNumberChecker {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        System.out.println("Proper divisors are: ");
        for(int i = 1; i < num; i++){
            if(num % i == 0){ //if i is the divisor of num
                System.out.print("\t"+i);
                sum += i;
            }
        }
        System.out.println();
        if(sum == num){
            System.out.println("The number is perfect");
        }else {
            System.out.println("The number is not perfect");
        }
    }
}
