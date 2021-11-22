package Chapter2;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        int dollars, halfDollars, quarters, dimes, nickels, pennies, amount, originalAmount;

        System.out.println("Enter Whole number greater than 0.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");

        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();

        originalAmount = amount;
        dollars = amount / 100;
        amount = amount % 100;
        halfDollars = amount / 50;
        amount = amount % 50;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
        System.out.println(originalAmount +
                " cents in coins can be given as:");
        System.out.println(dollars +"dollars");
        System.out.println(halfDollars +"halfDollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels and");
        System.out.println(pennies + " pennies");
    }
}
