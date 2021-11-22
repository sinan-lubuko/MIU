package com.oop;

public class FractionTest {

    public static void main(String[] args) throws Exception {
        Fraction f1 = new Fraction(4, 5);
        Fraction f2 = new Fraction(3, 4);

        int val1 = Fraction.compare(f1, f2);
        System.out.println(val1);

        int val2 = f1.compare(f2); //f1 is going to be the this
        System.out.println(val2);
    }
}
