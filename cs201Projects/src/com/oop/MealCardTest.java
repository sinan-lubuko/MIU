package com.oop;

import com.myutil.FoodItem;
import com.myutil.MealCard;
import com.myutil.Student;

public class MealCardTest {

    public static void main(String[] args){
        Student s1 = new Student("John", "CS", 555);
        Student s2 = new Student("Jack", "CS", 333);
        FoodItem foodItem1 = new FoodItem(12);

        try {
            MealCard card1 = new MealCard();
            MealCard card2 = new MealCard(50, s2); //might throw exception
            card1.setStudent(s1);
            card1.addBalance(50);
            System.out.println(card1.getBalance()); //150
            card1.purchaseFood(foodItem1); //might throw exception 150 -12
            System.out.println(card1.getBalance()); //138

            System.out.println(card2.getBalance()); //50
            card2.purchaseFood(foodItem1); //might throw exception //38
            System.out.println(card2.getBalance()); //38
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
