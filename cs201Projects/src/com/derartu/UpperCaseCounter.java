package com.derartu;

import java.util.Scanner;

public class UpperCaseCounter {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String str = scanner.next();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char letter = str.charAt(i);
            if(Character.isUpperCase(letter)){
                count++;
            }
        }
        System.out.println("Number of Uppercase letters: "+count);
    }
}
