package w2d3;

public class EmployeeMainApp {

    public static void main(String[] args){
        Employee e = new Employee(1234, "Jack", "CS", 75000);
        Manager m = new Manager(3456, "Jerry", "HR", 95000);
        Clerk c = new Clerk(7898, "Jeff", "Accounting", 55000);

        c.display();
        m.display();
        e.display();

        c.addBonus();
        m.addBonus();
        e.addBonus();
        System.out.println();
        c.display();
        m.display();
        e.display();

    }
}
