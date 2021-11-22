package Chapter2;

import java.util.Scanner;

public class FavoriteColorFoodAnimal {
    public static void main(String[]args){
        String favColor,favFood,favAnimal,name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your favorite color");
        favColor = keyboard.next();
        System.out.println("Enter your favorite food");
        favFood = keyboard.next();
        System.out.println("Enter your favorite animal");
        favAnimal = keyboard.next();
        System.out.println("Enter the first name of friend or relatives");
        name = keyboard.next();
        System.out.println("I had a dream " +name +  " "  +"ate a" +favColor + " "  +favAnimal+ " " +"and said it tasted like"+ " " +favFood+ '!');
    }
}
