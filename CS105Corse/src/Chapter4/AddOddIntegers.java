package Chapter4;

import java.util.Scanner;

public class AddOddIntegers {
    public static void main (String []args){
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any n value");
        n = keyboard.nextInt();
        int i = 1;
        int sum = 0;
        int num =1;
         while (i<=n){
             sum = sum + num;
             num= num+2;
              i = i+1;
         }
        System.out.println("The sum of the first"+ n+ "odd number is" +sum);



    }
}
