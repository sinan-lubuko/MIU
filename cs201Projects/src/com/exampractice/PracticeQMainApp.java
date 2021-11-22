package com.exampractice;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeQMainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> myList = new ArrayList<Student>();

        while (true) {
            System.out.println("Enter Name");
            String name = scanner.nextLine(); //" " => trim removes space
            name = name.trim();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Enter Id");
            int id = scanner.nextInt();
            System.out.println("Enter GPA");
            double gpa = scanner.nextDouble();
            System.out.println("Enter Age");
            int age = scanner.nextInt();
            scanner.nextLine(); //just to consume the rest of empty spaces after the age

            Student student = new Student(name, id, age, gpa);
            myList.add(student);
        }


        //part a: highest gpa
        int index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getGPA() > myList.get(index).getGPA()) {
                index = i;
            }
        }

        //part a: highest gpa
        double highestGPA = -1.0;
        String name = "";
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getGPA() > highestGPA) {
                highestGPA = myList.get(i).getGPA();
                name = myList.get(i).getName();
            }
        }

        //part a: lowest gpa
        double lowestGPA = 4.0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getGPA() < lowestGPA) {
                lowestGPA = myList.get(i).getGPA();
            }
        }

        System.out.println("Student with highest GPA: "+myList.get(index).getGPA());

        //part b: name of student with lowest gpa
        index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getGPA() < myList.get(index).getGPA()) {
                index = i;
            }
        }
        System.out.println("Student with lowest GPA: "+myList.get(index).getName());
        // part c oldest age
        index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getAge() > myList.get(index).getAge()) {
                index = i;
            }
        }
        System.out.println("Oldest age: "+myList.get(index).getAge());
        System.out.println("Name of oldest: "+myList.get(index).getName());

        // part d youngest age
        index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getAge() < myList.get(index).getAge()) {
                index = i;

            }
        }
        System.out.println("Youngest age: "+myList.get(index).getAge());
        System.out.println("Name of youngest: "+myList.get(index).getName());

        double sum= 0.0;
        for(int i = 0; i < myList.size(); i++){
            sum = sum + myList.get(i).getGPA();
        }
        double averageGpa = 0.0;
        averageGpa = sum/ myList.size();
        System.out.println("Average GPA: "+averageGpa);

        //longest name
        index = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getName().length() > myList.get(index).getName().length()) {
                index = i;
            }
        }
        System.out.println("Longest name: "+myList.get(index).getName());

        //youngest index
        int youngestIndex = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getAge() < myList.get(youngestIndex).getAge()) {
                youngestIndex = i;

            }
        }
        int secondYoungestIndex = 0;
        for (int i = 0; i < myList.size(); i++) {
            //make sure the youngest index is excluded
            if (myList.get(i).getAge() < myList.get(secondYoungestIndex).getAge() && (i != youngestIndex)) {
                secondYoungestIndex = i;
            }
        }
        System.out.println("Second youngest name: "+ myList.get(secondYoungestIndex).getName());
    }


    public int search(ArrayList<Student> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1; //if not found
    }
}
