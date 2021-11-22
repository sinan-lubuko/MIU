package Chapter3;

import java.util.Scanner;

public class GradeScale {
    String gradeValue;

    public static void main(String[] args) {
        String gradeValue;
        System.out.println("Enter the letter grade.");
        Scanner keyboard = new Scanner(System.in);
        gradeValue = keyboard.next();
        switch (gradeValue) {

            case ("A"):
                System.out.println("4.0");
                break;
            case ("B"):
                System.out.println("3.0");
                break;
            case ("C"):
                System.out.println("2.0");
                break;
            case ("D"):
                System.out.println("1.0");
                break;
            case ("F"):
                System.out.println("0.0");
                break;
            default:
                System.out.println("The grade is invalid");
                break;
        }
    }
}

