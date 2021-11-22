package com.arrays;

import java.util.Scanner;

public class ArraysOfPerson {

    public static void main (String[] args){
        Person[] person = new Person[20];

        String name, inpStr;
        int age;
        char gender;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < person.length; i++) {
            System.out.print("Enter name:");
            name = scanner.next ( );
            System.out.print("Enter age:");
            age = scanner.nextInt( );
            System.out.print("Enter gender:");
            inpStr = scanner.next( );
            gender = inpStr.charAt(0);
            person[i] = new Person(); //create a new Person and assign values
            person[i].setName(name);
            person[i].setAge(age);
            person[i].setGender(gender);
        }

        //Find all person with age bigger than 20 and output their name and age
        int targetAge = 20;
        for(int i = 0; i < person.length; i++){
            if(person[i].getAge() > targetAge){
                System.out.println("Name: "+person[i].getName()+" Age: "+person[i].getAge());
            }
        }
    }
}
