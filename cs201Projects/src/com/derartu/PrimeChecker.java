package com.derartu;

import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }
        if(number == 2){
           return true;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            if(num < 0){
                break;
            }

            System.out.println();
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

    }
}
