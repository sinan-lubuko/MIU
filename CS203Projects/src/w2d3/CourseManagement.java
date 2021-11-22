package w2d3;


import java.util.ArrayList;

public class CourseManagement {

    private ArrayList<Student> students;

    public CourseManagement() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void remove(int studentId) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                index = i;
            }
        }
        if (index != -1) {
            students.remove(index);
        }
    }

    public void calculateTotalCreditH() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            int total = 0;
            for (int j = 0; j < s.getCourses().size(); j++) {
                total = total + s.getCourses().get(j).getCreditHour();
            }
            System.out.println("Last name: "+s.getLastName()+", Total crHrs: "+total);
        }
    }

    public void displayMajorCourse(int studentId){
       int index = -1;
       for(int i = 0; i < students.size(); i++){
           if(students.get(i).getStudentId() == studentId){
               index = i;
               break;
           }
       }
       if(index != -1) {
           ArrayList<Course> courseList = students.get(index).getCourses();
           for(int j = 0; j < courseList.size(); j++){
               if(courseList.get(j) instanceof MajorCourse){
                   System.out.println(courseList.get(j).getCourseName());
               }
           }
       }
    }

}
