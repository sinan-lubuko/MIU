package com.lab4;

public class StudentTeacherMainApp {

    public static void main(String[] args){

        //String firstName, String lastName, String studentId, String course, String teacherName
        Student student1 = new Student("John", "Doe", "MIU001", "Object Oriented programming", "Muller");
        Student student2 = new Student("Amanda", "Clark", "MIU101", "Data Structures", "Smith");

        Teacher teacher1 = new Teacher("Emily", "Muller", "Object Oriented programming", 98000);
        Teacher teacher2 = new Teacher("Anne", "Smith", "Data Structures", 198000);

        student1.displayDetails();
        student2.displayDetails();
        teacher1.displayDetails();
        teacher2.displayDetails();
    }
}
