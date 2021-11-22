package com.sinan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeOutlet {

    public static final double pricePerBag = 5.50;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of bags ordered: ");
        int numberOfBags = scanner.nextInt();

        double discountPercentage;
        if(numberOfBags >= 300){
            discountPercentage = 30;
        } else if(numberOfBags >= 200){
            discountPercentage = 25;
        } else if(numberOfBags >= 150){
            discountPercentage = 20;
        } else if(numberOfBags >= 100){
            discountPercentage = 15;
        } else if(numberOfBags >= 50){
            discountPercentage = 10;
        } else if(numberOfBags >= 25){
            discountPercentage = 5;
        } else {
            discountPercentage = 0;
        }

        double totalCostBeforeDiscount = numberOfBags * pricePerBag;
        double totalDiscount = totalCostBeforeDiscount * discountPercentage/100;
        double totalCost = totalCostBeforeDiscount - totalDiscount;
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Number of Bags Ordered: "+numberOfBags+" - $ "+df.format(totalCostBeforeDiscount));
        System.out.println("Discount: ");
        System.out.println("\t\t"+discountPercentage+"% - $ "+df.format(totalDiscount));
        System.out.println("Your total charge is: $ "+df.format(totalCost));

    }
}
