package Chapter2;

import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a line of text.");

        String text = keyboard.nextLine();
        String replace = text.replaceFirst("hate", "love");

        System.out.println("I have rephrased that line to read:");
        System.out.println(replace);

    }
}
