package payrollmanagement;

import java.time.LocalDate;

public class PayrollTest {

    public static void main(String[] args){
        PayrollManager payrollManager = new PayrollManager();
        Employee e1 = new FullProfessor("Jack", "Ryan", LocalDate.now().minusYears(21), 120000);
        Employee e2 = new HourlyPaidStaff("Anita", "Smith", LocalDate.now().minusYears(10), 12.5);
        payrollManager.registerEmployee(e1);
        payrollManager.registerEmployee(e2);
        Employee e3 = new Instructor("Anna", "Morgan", LocalDate.now().minusYears(30), 80000);
        payrollManager.registerEmployee(e3);

        Employee e4 = new Instructor("John", "Clark", LocalDate.now().minusYears(25), 80000);
        //update e3 by e4
        payrollManager.updateEmployee(e3, e4);

        //delete e2
        //payrollManager.deleteEmployee(e2);

        payrollManager.registerTimeOff(e4, LocalDate.now(), LocalDate.now().plusDays(10)); //10 days
        payrollManager.registerTimeOff(e4, LocalDate.now().minusMonths(3), LocalDate.now().minusMonths(3).plusDays(10));//10 days

        Employee emp = payrollManager.getMostPaidEmployee();
        System.out.println(emp);

        payrollManager.displayNetSalaryAndDeduction(e4);

    }
}
