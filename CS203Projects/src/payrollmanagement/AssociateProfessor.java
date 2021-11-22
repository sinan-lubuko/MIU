package payrollmanagement;

import java.time.LocalDate;

public class AssociateProfessor extends Faculty {
    private static final int PAID_TIME_OFF_DAYS = 21;
    private static final double DEDUCTION_PER_DAY = 1.3;

    public AssociateProfessor(String firstName, String lastName, LocalDate dateOfBirth, double grossSalary) {
        super(firstName, lastName, dateOfBirth, grossSalary, PAID_TIME_OFF_DAYS, DEDUCTION_PER_DAY);
    }

    @Override
    public String toString() {
        return "AssociateProfessor "+super.toString();
    }

}
