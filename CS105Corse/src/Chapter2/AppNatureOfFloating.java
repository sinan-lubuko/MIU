package Chapter2;

import java.util.Scanner;

public class AppNatureOfFloating {
    public static void main(String [] args){
        Scanner  keyboard = new Scanner(System.in);
        System.out.println("Enter any Floating number");
        double x = keyboard.nextDouble();
        double y = 1.0/x;
        double result = x *y-1;
        System.out.println(x );
        System.out.println(y);
        System.out.println(x * y);
        System.out.println(result);
    }
}
