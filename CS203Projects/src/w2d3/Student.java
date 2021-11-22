package w2d3;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String department;
    private int studentId;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String department, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> course) {
        this.courses = course;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        if(this.studentId  > o.studentId){
            return 1;
        }
        else if (this.studentId < o.studentId){
            return -1;
        }
        return 0;
    }

}

