package w2d3;

public class Course {
    protected String courseName;
    protected int courseCode;
    protected int creditHour;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", creditHour=" + creditHour +
                '}';
    }

    public Course(String courseName, int courseCode, int creditHour) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHour = creditHour;


    }
}
