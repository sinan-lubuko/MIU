import java.util.Scanner;

public class FlowerCounter {
    public static void main (String []args){

            String[] typesOfFlower = {"petunia",  "pansy", "rose", "violet", "carnation"};
            double[] prices = {0.50, 0.75, 1.50, 0.50, 0.80};

            Scanner input = new Scanner(System.in);


            System.out.println("What kinda flower would you like? ");
            String flower = input.next();

            int flowerIndex = -1;
            for(int i=0; i<typesOfFlower.length; i++){
                if(typesOfFlower[i].equals(flower))
                    flowerIndex = i;
            }

            if(flowerIndex == -1)

                System.out.println("We don't have that kind of flower.");
            else {
                System.out.println("Enter number of Flower you want ");
                int number = input.nextInt();
                double totalCost = number * prices[flowerIndex];

                System.out.println(flower  + ": " + number + " at " + prices[flowerIndex]
                        + " will cost " + totalCost);
            }





        }
    }


