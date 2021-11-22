package Chapter4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String str, rev = " ";

        System.out.println("Enter a String");
        str = keyboard.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
            System.out.println("Reversed String: " + rev);
        }
    }



