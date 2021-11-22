package com.lab4.part1;

public class Employee extends Member {
    private String specialization;

    public Employee(String specialization) {
        this.specialization = specialization;
    }
//The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
    public Employee(String name, int age, String phoneNumber, Address address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
