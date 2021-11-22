package w2d3;

public class Employee {

    protected int employeeId;
    protected String name;
    protected String department;
    protected double salary;

    private static final double BONUS = 200;

    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee e = (Employee) obj;
        return this.employeeId == e.employeeId
                && this.name.equals(e.name)
                && this.department.equals(e.department)
                && this.salary == e.salary;
    }

    public double addBonus(){
        this.salary = this.salary + BONUS*12;
        return this.salary;
    }

    public void display(){
        System.out.println("Name: "+this.name+", Employee Id: "+this.employeeId
                +", Department: "+this.department+", Salary: "+this.salary);
    }

}
