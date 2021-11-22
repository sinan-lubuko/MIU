package payrollmanagement;

import java.time.LocalDate;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected LocalDate dateOfBirth;

    public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return firstName +" " + lastName +" "+ dateOfBirth.toString();
    }


    @Override //the assumption is two employee objects are equal if their fn, ln and dob matches
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return this.firstName.equals(e.firstName)
                && this.lastName.equals(e.lastName)
                && this.dateOfBirth.toString().equals(e.dateOfBirth.toString());
    }


    public double calculateTaxDeduction() {
        double taxAmount = 0.0;
        double annualSalary = this.getSalary();
        if(annualSalary <= 50000){
            taxAmount = 0;
        }
        else if(50000 < annualSalary && annualSalary <= 70000){
            taxAmount = taxAmount + (annualSalary - 50000) * 0.1;
        }
        else if(70000 < annualSalary && annualSalary <= 90000){
            taxAmount = taxAmount + 20000 * 0.1; //tax from 50k to 70k
            taxAmount = taxAmount + (annualSalary - 70000) * 0.15;
        }
        else if(90000 < annualSalary && annualSalary <= 120000){
            taxAmount = taxAmount + 20000 * 0.1; //tax from 50k to 70k
            taxAmount = taxAmount + 20000 * 0.15; //tax from 70k to 90k
            taxAmount = taxAmount + (annualSalary - 90000) * 0.2;
        }
        else {
            taxAmount = taxAmount + 20000 * 0.1; //tax from 50k to 70k
            taxAmount = taxAmount + 20000 * 0.15; //tax from 70k to 90k
            taxAmount = taxAmount + 30000 * 0.2; //tax from 90k to 120k
            taxAmount = taxAmount + (annualSalary - 120000) * 0.3;
        }
        return taxAmount;
    }

    public abstract double calculateTimeOffDeduction(int timeOffDays); //abstract

    public abstract double getSalary();//abstract
}
