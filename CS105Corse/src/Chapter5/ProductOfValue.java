package Chapter5;

import java.util.Scanner;

public class ProductOfValue {
    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value");
        int number = 1;
        int product =1;
        while(number!=0) {

            product = product * number;
            number=input.nextInt();
        }
        System.out.println(product);
    }
}
