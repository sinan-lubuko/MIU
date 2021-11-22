package com.myutil;

public class Employee123 {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee123() {
        this.name = "unknown";
        this.salary= 0.0;
    }

    public Employee123(Employee123 e) {
        this.name = e.getName();

        this.salary= e.getSalary();

    }
    public Employee123(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}

