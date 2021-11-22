package Chapter3;

import java.util.Scanner;

public class EvenOrodd {
    public static void main(String[]args){
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter whole number");
        number = keyboard.nextInt();
        if (number%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
    }

}
