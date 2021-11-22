package com.lab4;

public class Student extends Person{

    private String studentId;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, String studentId, String course, String teacherName) {
        super(firstName, lastName);
        this.studentId = studentId;
        this.course = course;
        this.teacherName = teacherName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void displayDetails(){
        System.out.println("FirstName: "+firstName+", LastName: "+lastName+ ", StudentId: "+studentId+", Course: "+course+ ", TeacherName: "+teacherName);
    }
}
