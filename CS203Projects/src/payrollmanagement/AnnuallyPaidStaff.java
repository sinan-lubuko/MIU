package payrollmanagement;

import java.time.LocalDate;

public class AnnuallyPaidStaff extends Staff {
    private static final int PAID_TIME_OFF_DAYS = 7;
    private double annualSalary;

    public AnnuallyPaidStaff(String firstName, String lastName, LocalDate dateOfBirth, double annualSalary) {
        super(firstName, lastName, dateOfBirth);
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "AnnuallyPaidStaff "+super.toString()+" "+annualSalary;
    }

    @Override
    public double calculateTimeOffDeduction(int timeOffDays) {
        double deduction = 0.0;
        if(timeOffDays > PAID_TIME_OFF_DAYS){
            int extraTimeOffDays = timeOffDays - PAID_TIME_OFF_DAYS;

            deduction = extraTimeOffDays * annualSalary/365;
        }
        return deduction;
    }

    @Override
    public double getSalary() {
        return annualSalary;
    }
}
