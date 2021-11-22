package Chapter3;

import java.util.Scanner;

public class ValidTestScore {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
        int score;
        System.out.println("Enter a number in the range of 0 to 100");
        score = keyboard.nextInt();
        if(score<100 && score >0)
            System.out.println("score is valid");
        else
            System.out.println("score is not valid");
    }

}