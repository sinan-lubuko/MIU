package com.sinan;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private Address homeAddress;
    private Address workAddress;

    public Employee(String f,String l, double s){
         firstName = f;
         lastName = l;
         salary = s;
    }
    public String getFirstname(){
        return firstName;
    }

    public void setFirstname(String f){
        firstName = f;
    }

    public String getlastName(){
        return lastName;
    }

    public void setLastname(String l ) {
        lastName = l;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address ha) {
        homeAddress = ha;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address wa) {
        workAddress = wa;
    }

    public double getSalary() {
        return salary;
    }
}
