package payrollmanagement;

import java.time.LocalDate;

public class HourlyPaidStaff extends Staff {
    private static final int PAID_TIME_OFF_DAYS = 5;
    private double hourlyRate;

    public HourlyPaidStaff(String firstName, String lastName, LocalDate dateOfBirth, double hourlyRate) {
        super(firstName, lastName, dateOfBirth);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "HourlyPaidStaff "+super.toString()+" "+hourlyRate;
    }

    @Override
    public double calculateTimeOffDeduction(int timeOffDays) {
        double deduction = 0.0;
        if(timeOffDays > PAID_TIME_OFF_DAYS){
            int extraTimeOffDays = timeOffDays - PAID_TIME_OFF_DAYS;
            deduction = extraTimeOffDays * hourlyRate * 8.0;
        }
        return deduction;
    }

    @Override
    public double getSalary() {
        return hourlyRate * 2080;
    }
}
