package Chapter3;

import java.util.Scanner;

public class ChangeIntegerValue {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        System.out.println("Enter any number");
        x = keyboard.nextInt();
        if(x%2==0)
            x = x/2;
        else
            x = x*3-1;
        System.out.println(x);
    }
}
