package com.lab4.part1;

import com.lab4.part1.Address;
import com.lab4.part1.Employee;
import com.lab4.part1.Manager;

public class MyMainClass {
    public static void main(String [] args) {
        Address add2 = new Address("pea body st", "55662", "IA");
        Address add1 = new Address("malibu Circle", "22041", "VA");
        Employee e1 = new Employee("Ashley", 25, "20256011", add1, 40000, "Machine Learning");
        Manager manager1 = new Manager("John", 30, "2022501212", add2, 35000, "Computer Science");
        System.out.println(e1.getSpecialization());
        System.out.println(manager1.getDepartment());

    }
}
