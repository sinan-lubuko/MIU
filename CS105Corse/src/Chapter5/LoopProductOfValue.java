package Chapter5;

import java.util.Scanner;

public class LoopProductOfValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Program-1 - Product of numbers with sentinal value 0
        int product = 1;
        System.out.print("Enter a value:");
        int value = input.nextInt();
        if (value == 0) product = 0;
        while (value != 0) {
            product = product* value;
            System.out.print("Enter another value:");
            value = input.nextInt();
        }
        System.out.println("Product: " + product);

    }
}
