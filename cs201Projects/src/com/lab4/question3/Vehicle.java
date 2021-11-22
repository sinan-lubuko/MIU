package com.lab4.question3;
import java.util.Objects;

public class Vehicle {

    protected String manufacturerName;

    protected int numberOfCylinders;

    protected Person owner;

    public Vehicle(String manufacturerName, int numberOfCylinders, Person owner) {
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.owner = owner;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ManufacturerName= " + manufacturerName +", NumberOfCylinders= " + numberOfCylinders +", Owner " + owner.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return numberOfCylinders == vehicle.numberOfCylinders && Objects.equals(manufacturerName, vehicle.manufacturerName) && Objects.equals(owner, vehicle.owner);
    }

}
