package w2d4;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentByIdMainApp {

    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Smith", 5345);
        Student student2 = new Student("John", 1345);
        Student student3 = new Student("Alex", 6345);
        Student student4 = new Student("Kevin", 8345);
        Student student5 = new Student("Joe", 2345);
        Student student6 = new Student("Jack", 4345);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("Before sort");
        for(Student s : students){
            System.out.println("Last Name: "+ s.getLastName()+", Id: "+s.getIdNumber());
        }

        //ComparatorById comparatorById = new ComparatorById();
        //ComparatorByLastName comparatorByLastName = new ComparatorByLastName();
        //Collections.sort(students, comparatorById);

        Collections.sort(students); //sort using Collections.sort
        System.out.println("After sort");
        for(Student s : students){
            System.out.println("Last Name: "+ s.getLastName()+", Id: "+s.getIdNumber());
        }

    }
}
