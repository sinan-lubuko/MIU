package payrollmanagement;

import java.time.LocalDate;

public abstract class Staff extends Employee {

    public Staff(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

}
