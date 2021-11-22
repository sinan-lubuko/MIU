package payrollmanagement;

import java.time.LocalDate;

public class AssistantProfessor extends Faculty {
    private static final int PAID_TIME_OFF_DAYS = 14;
    private static final double DEDUCTION_PER_DAY = 1.4;

    public AssistantProfessor(String firstName, String lastName, LocalDate dateOfBirth, double grossSalary) {
        super(firstName, lastName, dateOfBirth, grossSalary, PAID_TIME_OFF_DAYS, DEDUCTION_PER_DAY);
    }

    @Override
    public String toString() {
        return "AssistantProfessor "+super.toString();
    }

}
