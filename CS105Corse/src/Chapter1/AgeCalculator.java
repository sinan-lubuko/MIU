package Chapter1;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Birthday Greeting");
        System.out.println("what year were you born?");
        int bornYear = keyboard.nextInt();
        int currentYear = 2021;
        int ageCalculator = bornYear - currentYear;
        System.out.println("I can't believe you are" + ageCalculator +"years old");

    }
}
