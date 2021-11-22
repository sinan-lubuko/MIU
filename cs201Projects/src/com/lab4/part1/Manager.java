package com.lab4.part1;

public class Manager extends Member {
    private String department;

    public Manager(String department) {
        this.department = getDepartment();
    }

    public Manager(String name, int age, String phoneNumber, Address address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
