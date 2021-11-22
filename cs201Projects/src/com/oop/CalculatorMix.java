package com.oop;

public class CalculatorMix {
    public int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int add(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public String add(String s1, String s2) {
        String s3 = s1 + s2;
        return s3;
    }

    public static void main(String[] args){
        CalculatorMix calculatorMix = new CalculatorMix();
        System.out.println(calculatorMix.add(30, 40));
        System.out.println(calculatorMix.add(30, 40, 50));
        System.out.println(calculatorMix.add(30.5, 40.5));
        System.out.println(calculatorMix.add("Object ", "Oriennted Programming"));
    }
}
