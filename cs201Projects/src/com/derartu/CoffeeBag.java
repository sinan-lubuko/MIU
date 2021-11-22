package com.derartu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeBag {

    public final double pricePerLB = 5.99;
    public final double taxRate = 7.25;

    public double calculateTotalPrice(double bagWeight, int numberOfBags){
        double totalPrice = bagWeight * numberOfBags * pricePerLB;
        double totalPriceWithTax = totalPrice + totalPrice * taxRate/100;
        return totalPriceWithTax;
    }

    public static void main(String[] args){
        CoffeeBag coffeeBag;
        coffeeBag = new CoffeeBag();

        Scanner scanner = new Scanner(System.in);
        double weightPerBag;
        int bags;

        System.out.print("Enter unit weight of a bag in lb: ");
        weightPerBag = scanner.nextDouble();

        System.out.print("Enter number of bags sold: ");
        bags = scanner.nextInt();

        double total = coffeeBag.calculateTotalPrice(weightPerBag, bags);
        DecimalFormat df = new DecimalFormat("0.00");

        //Display
        System.out.println("Number of bags sold: "+bags);
        System.out.println("Weight per bag: "+weightPerBag);
        System.out.println("Price per pound: $"+coffeeBag.pricePerLB);
        System.out.println("Sale Tax: "+coffeeBag.taxRate+"%");
        System.out.println("\n Total price: $ "+df.format(total));

    }
}
