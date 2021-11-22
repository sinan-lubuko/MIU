package Chapter1;

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String [] args) {
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter temprature in Fahrenheit");
        double F = keyboard.nextDouble();
        double C;
        C = (F-32)* 5/9;
        System.out.println("Temprature in celsius" +C);

        System.out.println(3 );
        System.out.println(2 );
        System.out.println(1);

        }
    }

