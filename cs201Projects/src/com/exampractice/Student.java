package com.exampractice;

public class Student {
    private String name;
    private int id;
    private int age;
    private double GPA;

    public Student(){

    }

    public Student(String name, int id, int age, double GPA) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
