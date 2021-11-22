package com.derartu;

import java.util.Scanner;

 public class HeightUtil {

    public double getRecommendedWeight(double height, int age){
        double rw = (height- 100 + age/10)* 0.90;
        return rw;
    }

    public static void main(String[] args){
        HeightUtil heightUtil;
        heightUtil = new HeightUtil();

        Scanner scanner = new Scanner(System.in);
        double height;
        int age;

        System.out.print("Enter the height in cm: ");
        height = scanner.nextDouble();

        System.out.print("Enter age: ");
        age = scanner.nextInt();

        double weight = heightUtil.getRecommendedWeight(height, age);
        System.out.println("Recommended weight: "+weight);
    }
}
