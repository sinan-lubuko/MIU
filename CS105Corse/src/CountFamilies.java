import java.util.Scanner;

public class CountFamilies {

    public static void main(String[] args) {
        System.out.println("Enter number of families? ");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        double[] data = new double[k];
        for (int i = 0; i < data.length; i++) {
            System.out.println("Family income " + (i + 1) + " ");
            data[i] = input.nextDouble();
        }
        double max = data[0];


        for (int i = 0; i < data.length; i++) {


            if (data[i] > max)


                max = data[i];


        }


        System.out.println(" maximum income is: " + max);


        System.out.println("10% of maximum income is: " + (0.1 * max));



        System.out.println("\nprint all families incomes with less than 10% of the max");


        int count = 0;


        for (int i = 0; i < data.length; i++) {


            if (data[i] < (0.1 * max)) {


                count++;


                System.out.println("Family " + (i + 1) + " have income of " + data[i]);


            }



        }
        System.out.println("The total is: " + count);
    }

}
