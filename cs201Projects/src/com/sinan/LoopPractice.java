package com.sinan;

import java.util.Scanner;

public class LoopPractice {

    public static void printAllDivisors(int number){
        for(int i = 1; i <= number; i++){
            if(number % i == 0)
                System.out.println(i); //1, 5
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0, number = 1;
        while (number <= 100 ) {
            sum = sum + number;
            number = number + 1;
        }
        System.out.println("Sum: "+sum); //1+2+3+ ...+100 = 5050
        System.out.println("Number: "+number); //101

        sum = 0;
        number = 1;
        while (sum <= 1000000 ) {
            sum = sum + number;
            number = number + 1;
        }
        System.out.println("Sum: "+sum); //1 + 2 + 3 + 4 +.....
        System.out.println("Number: "+number);

        int product = 1;
        number = 1;
        while (number <= 20) {
            product = product * number;
            number = number + 2;
        }
        System.out.println("Product: "+product); //1*1*3*5*7*9*....*19
        System.out.println("Number: "+number); //21

       /*
        int age;
        System.out.print("Your Age (between 0 and 130): ");
        age = scanner.nextInt( );
        while (age < 0 || age > 130) {
            System.out.println(
                    "An invalid age was entered. Please try again.");
            System.out.print( age);
            System.out.print("\nYour Age (between 0 and 130): ");
            age = scanner.nextInt( );
        }
        */

        /*
        int count = 1;
        while ( count != 10 ) {
            count = count + 2;
        }
        System.out.println("Count: "+count);
        */
        String name = "Addisu";
        while (true){
            System.out.print("Your name: ");
            name = scanner.next( );
            if (name.length() > 0)
                break;

            System.out.println("Invalid Entry." +
                    "You must enter at least one character.");
        }

        /*
        System.out.println("For loop");
        int i, summ = 0, num;
        for (i = 0; i < 10; i++) {
            num = scanner.nextInt();
            summ += num;
        }
        System.out.println("Summ: "+summ);
        */

        System.out.println("We are about to call printAllDivisors method");

        printAllDivisors(12);

        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(" *"); //not println
            }
            System.out.println(); //new line
        }

        /*
        Multiplication table
        x   1   2   3   4   5   6   7   8   9   10
        1   1   2   3   4   5   6   7   8   9   10
        2   2   4   6   8   10 ....
        3   3   6   9 ....
        4   4   8 ...
        5   5   10 ...
        6
        7
        8
        9
        10
         */
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print("\t"+i*j); //not println
            }
            System.out.println(); //new line
        }


        for(int i = 11; i <= 20; i++){
            for(int j = 5; j <= 25; j += 5){
                System.out.print("\t"+i*j*19); //not println
            }
            System.out.println(); //new line
        }

        System.out.println();
        for(int i = 10; i <= 40; i += 10){
            for(int j = 0; j < 10; j++){
                System.out.print("\t"+(i+j)); //not println
            }
            System.out.println(); //new line
        }


    }
}
