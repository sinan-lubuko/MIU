package w2d3;

public class Manager extends Employee {

    private static final double BONUS = 300;

    public Manager(int employeeId, String name, String department, double salary) {
        super(employeeId, name, department, salary);
    }

    @Override
    public double addBonus() {
        this.salary = this.salary + BONUS*12;
        return this.salary;
    }
}
