import java.util.Scanner;

public class SmallestNumber {
    public static void main(String [] args) {
            Scanner input = new Scanner(System.in);
            int number;
            int num;
            System.out.println("enter the number of integers you want to store in an " +
                    "array");
            number = input.nextInt();
            int[] x = new int[number];
            int smallest = x[0];
            for (int i = 0; i < number; i++) {
                System.out.println("enter the number at index " + i);
                num = input.nextInt();
                x[i] = num;
                if (smallest > x[i]) {
                    smallest = x[i];
                }
            }
            System.out.print("your array of numbers is " + "\n" + "[ ");
            for (int i = 0; i < number; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println("]" + "\nThe smallest number from the given int array is " + smallest);

        }
    }

