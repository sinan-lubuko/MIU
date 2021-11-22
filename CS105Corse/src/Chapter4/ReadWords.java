package Chapter4;

import java.util.Scanner;

public class ReadWords {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        String word = "";
        System.out.println("Please enter the next word.");
        word = keyboard.next();
        while(!word.equals("done")){
                if(word.charAt(0) == word.charAt(word.length()-1)){
                    System.out.println("The word " + word + " has first and last" +
                            "characters that are the same.");
                }
                word = keyboard.next();
            }


    }
}
