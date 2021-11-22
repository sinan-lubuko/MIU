package payrollmanagement;

import java.time.LocalDate;

public class EmployeeTimeOff {

    private LocalDate startDate;
    private LocalDate endDate;
    private Employee employee;

    public EmployeeTimeOff(LocalDate startDate, LocalDate endDate, Employee employee) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.employee = employee;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString() +" "+ startDate +" "+ endDate;
    }
}
