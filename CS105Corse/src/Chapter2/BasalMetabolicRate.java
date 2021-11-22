package Chapter2;

import java.util.Scanner;

public class BasalMetabolicRate {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        double weight ;
        double height ;
        int age;
        final double BMR_MALE;
        final double BMR_FEMALE;

        System.out.println("Enter your weight in pound");
        weight = keyboard.nextDouble();
        System.out.println("Enter your height in inches");
        height = keyboard.nextDouble();
        System.out.println("Enter your age in year");
        age = keyboard.nextInt();

        BMR_FEMALE = 655 + (4.3 * weight ) + (4.7 * height) - (4.7 *age);
        BMR_MALE= 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        double numberOfChocolateBarForMale = BMR_MALE/230;
        double numberOfChocolateBarForFemale = BMR_FEMALE/230;
        System.out.println("number of chocolateBar for male" +numberOfChocolateBarForMale);
        System.out.println("number of ChocolateBar ForFemale" +numberOfChocolateBarForFemale );








        

    }

}
