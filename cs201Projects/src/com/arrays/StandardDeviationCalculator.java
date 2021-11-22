package com.arrays;

import java.util.Scanner;

public class StandardDeviationCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N; //size of data
        System.out.print("Enter the number of data: ");
        N = scanner.nextInt();

        double[] numbers = new double[N];
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.print("Enter data "+(i+1) + " :");
            numbers[i] = scanner.nextDouble();
        }

        double average = 0;
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        average = sum/numbers.length;

        double squaredDeviationSum = 0;
        for(int i = 0; i < numbers.length; i++){
            double value = (numbers[i] - average) * (numbers[i] - average); // (xi - ave)^2
            squaredDeviationSum += value;
        }

        double sd = Math.sqrt(squaredDeviationSum/numbers.length);
        System.out.println("The standard deviation is "+ sd);

    }
}
