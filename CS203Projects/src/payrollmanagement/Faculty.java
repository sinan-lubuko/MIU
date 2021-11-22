package payrollmanagement;

import java.time.LocalDate;

public class Faculty extends Employee {
    protected double grossSalary;
    protected int allowedPTODays;
    protected double deductionsPerDay;

    public Faculty(String firstName, String lastName, LocalDate dateOfBirth,
                   double grossSalary, int allowedPTODays, double deductionsPerDay) {
        super(firstName, lastName, dateOfBirth);
        this.grossSalary = grossSalary;
        this.allowedPTODays = allowedPTODays;
        this.deductionsPerDay = deductionsPerDay;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    @Override
    public String toString() {
        return  super.toString()+" "+grossSalary;

    }


    @Override
    public double calculateTimeOffDeduction(int timeOffDays) {
        double deduction = 0;
        if(timeOffDays > allowedPTODays){
            int extraTimeOffDays = timeOffDays - allowedPTODays;
            deduction = extraTimeOffDays * grossSalary/365 * deductionsPerDay;
        }
        return deduction;
    }

    @Override
    public double getSalary() {
        return grossSalary;
    }
}
