package com.arrays;

import java.util.Scanner;

public class ArraysOfEmployee {
    /* Requirements:
        1. Create an Employee class with properties name, age and salary
        2. Declare and create an array of Employee objects (size 6)
        3. Get the object properties from the user, create the objects and populate the array with objects
        4. display the name and salary of all employees
        5. Display name of employees who make more than 50k
        6. Update the name of an employee whose name is "Addisu" to "Berisa"
        7. Print the name of all employees
     */

    public static void main(String[] args){
        //declare and create scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //declare array of Employee objects
        Employee[] empArray;

        //create array of Employee objects (size = 6)
        empArray = new Employee[3];

        //create objects and populate the array
        String name;
        int age;
        double salary;
        for(int i = 0; i < empArray.length; i++){
            //Employee -> name, age, salary
            System.out.println("Enter name: ");
            name = scanner.next();
            System.out.println("Enter age: ");
            age = scanner.nextInt();
            System.out.println("Enter salary: ");
            salary = scanner.nextDouble();

            //empArray[i] = new Employee(name, age, salary);
            empArray[i] = new Employee();
            empArray[i].setName(name);
            empArray[i].setAge(age);
            empArray[i].setSalary(salary);
        }

        //print names and salaries of all employees
        for(int i = 0; i < empArray.length; i++){
            System.out.println("Employee name: "+ empArray[i].getName()+" salary: "+empArray[i].getSalary());
        }

        //print name of employees who make more than 50k
        System.out.println("Employee who make more than 50k:");
        for(int i = 0; i <empArray.length; i++){
            if(empArray[i].getSalary() > 50000){
                System.out.println(empArray[i].getName());
            }
        }

        //Change the name of Employee "Addisu" to "Berisa"
        for(int i = 0; i < empArray.length; i++){
            if(empArray[i].getName().equals("Addisu")){
                empArray[i].setName("Berisa");
            }
        }

        //print names of all employees
        System.out.println("Name of all Employees:");
        for(int i = 0; i < empArray.length; i++){
            System.out.println(empArray[i].getName());
        }

        System.out.println("Name of all Employees using for-each");
        for(Employee e: empArray){
            System.out.println(e.getName());
        }

        /*
        int[] ar = {34, 45, 10, 56, 100};
        int sum = 0;
        for(int num: ar){
           sum += num;
        }
        System.out.println("Sum: "+sum);
        */
    }
}
