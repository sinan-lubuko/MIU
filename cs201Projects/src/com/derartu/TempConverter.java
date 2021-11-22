package com.derartu;
import java.util.Scanner;
public class TempConverter {

    private int a;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in celsius");
        double tc;
        double fr;
        tc = scanner.nextDouble();
        fr = 1.8 * tc +32;
        System.out.println("Temperature in Fahrenheit is "+fr);
    }

}
