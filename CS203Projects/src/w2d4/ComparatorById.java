package w2d4;

import java.util.Comparator;

public class ComparatorById implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
       if(s1.getIdNumber() > s2.getIdNumber()){
           return 1;
       }
       else if(s1.getIdNumber() < s2.getIdNumber()){
           return -1;
       }
       return 0;
    }
}
