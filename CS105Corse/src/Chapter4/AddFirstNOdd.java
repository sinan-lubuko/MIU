package Chapter4;

import java.util.Scanner;

public class AddFirstNOdd {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter n Value");
        int n;
        n = keyboard.nextInt();
        int i =1;
        int sum = 0;
        while (i<=n){
            if(i%2!=0){
                sum = sum+i;
                i++;
            }
        }
        System.out.println("The sum of the first n natural number is" +"" +sum);
    }
}
