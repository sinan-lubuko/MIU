package com.derartu;

import java.util.Scanner;

public class SentenceReverse {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            if(sentence.length() == 0){ //empty string
               break;
            }
            StringBuffer sb = new StringBuffer(sentence);
            sb.reverse(); //reverses the texts
            System.out.println(sb.toString());
        }
    }
}
