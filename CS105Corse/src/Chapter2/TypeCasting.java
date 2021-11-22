package Chapter2;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a double number");
        double x= keyboard.nextDouble();
        double y = (int)x;
        System.out.println((int)x);
        System.out.println((double) y);
        double z = (byte) x;
        System.out.println((byte)x);
        System.out.println((double)z);
    }
}
