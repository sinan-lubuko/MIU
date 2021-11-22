package com.sinan;

import java.util.Scanner;

public class SelectionPractice {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a power of ten: ");
        int selection = scanner.nextInt();

        switch(selection){
            case 6: //if
                System.out.println("Million");
                break;
            case 9: //else if
                System.out.println("Billion");
                break;
            case 12:
                System.out.println("Trillion");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
            case 30:
                System.out.println("Nonillion");
                break;
            case 100: //else if
                System.out.println("Googol");
                break;
            default: //else
                System.out.println("Invalid selection");
        }
    }
}
