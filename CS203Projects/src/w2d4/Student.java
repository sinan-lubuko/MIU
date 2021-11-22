package w2d4;

public class Student implements Comparable<Student>{

    private String lastName;
    private int idNumber;

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /*@Override
    public int compareTo(Student s) {
        if(this.idNumber > s.idNumber){
            return 1;
        }
        else if(this.idNumber < s.idNumber){
            return -1;
        }
        return 0;
    }*/

    @Override
    public int compareTo(Student s) {
        return this.lastName.compareTo(s.lastName); //compare by last name in lexicographical order
    }

}
