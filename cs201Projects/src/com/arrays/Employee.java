package com.arrays;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        salary = s;
    }
}
