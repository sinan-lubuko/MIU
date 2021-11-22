package com.oop;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator of a fraction can not be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator of a fraction can not be zero");
        }
        this.denominator = denominator;
    }

    // f1 = n1/d1  and f2 = n2/d2
    // n1 * d1 > n2 * d1 => f1 is greater
    // n1 * d1 < n2 * d1 => f1 is less
    public static int compare(Fraction f1, Fraction f2){
        if(f1.getNumerator() * f2.getDenominator() < f2.getNumerator() * f1.getDenominator()){ //f1 is less
            return -1;
        }
        else if(f1.getNumerator() * f2.getDenominator() > f2.getNumerator() * f1.getDenominator()){ //f1 is greater
            return 1;
        }
        else {
            return 0;
        }
    }

    //f is an object of Fraction class and is passed as argument to the method
    //we call the method compare using an object from the main method. keyword this refers to that object
    public int compare(Fraction f){
        if(this.getNumerator() * f.getDenominator() < f.getNumerator() * this.getDenominator()){ //this is less
            return -1;
        }
        else if(this.getNumerator() * f.getDenominator() > f.getNumerator() * this.getDenominator()){ //this is greater
            return 1;
        }
        else {
            return 0;
        }
    }
}
