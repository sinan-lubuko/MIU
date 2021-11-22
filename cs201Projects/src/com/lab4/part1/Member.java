package com.lab4.part1;

import com.lab4.part1.Address;

public class Member {
    protected  String name;
    protected int age;
    protected String phoneNumber;
    protected Address address;
    protected double salary;

    public Member(){
       }

    public Member(String name, int age, String phoneNumber, Address address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void PrintSalary(String name) {
        System.out.println(salary);
    }
}
