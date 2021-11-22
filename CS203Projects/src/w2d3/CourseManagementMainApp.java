package w2d3;

import java.util.ArrayList;

public class CourseManagementMainApp {

    public static void main(String [] args) {
        CourseManagement manege = new CourseManagement();
        //String firstName, String lastName, String department, int studentId
        Student student1 = new Student("derartu", "Abdisa", "computer science", 111164);
        Student student2 = new Student("Lemlem", "fereja", "ComputerScience", 222254);
        Student student3 = new Student("Eeggi", "keven", "ComputerScience", 333362);

        //String courseName, int courseCode, int creditHour)
        Course course0 = new Course("cs105",222,4);
        Course course01 = new Course("cs201", 2231,4);
        Course course02 = new Course("203",2223,4);
        ArrayList<Course> courseList1 = new ArrayList<>();
        ArrayList<Course> courseList2 = new ArrayList<>();
        ArrayList<Course> courseList3 = new ArrayList<>();

        courseList3.add(course0);
        courseList3.add(course01);
        courseList3.add(course02);



        courseList2.add(course0);
        courseList2.add(course01);
        courseList2.add(course02);


        courseList1.add(course0);
        courseList1.add(course01);
        courseList1.add(course02);

        student1.setCourses(courseList1);
        student2.setCourses(courseList2);
        student3.setCourses(courseList3);


        manege.addStudent(student1);
        manege.addStudent(student2);
        manege.addStudent(student3);









    }
}
