package Chapter3;

import java.util.Scanner;

public class YesOrResponse {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter yes or No");
            String response = keyboard.next();
            boolean accept;
            if ((response.equalsIgnoreCase("yes")) || (response.equalsIgnoreCase("y")))
                accept = true;
            else
                accept = false;
            System.out.println(accept);
        }

    }



