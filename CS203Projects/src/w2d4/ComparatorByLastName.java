package w2d4;

import java.util.Comparator;

public class ComparatorByLastName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
