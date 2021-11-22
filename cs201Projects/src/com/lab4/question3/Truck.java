package com.lab4.question3;

public class Truck extends  Vehicle {

    private double loadCapacity;
    private int towingCapacity;

    public Truck(String manufacturerName, int numberOfCylinders, Person owner, double loadCapacity, int towingCapacity) {
        super(manufacturerName, numberOfCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+ ", LoadCapacity=" + loadCapacity +", TowingCapacity=" + towingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)){
            return false;
        }
        Truck truck = (Truck) o;
        return Double.compare(truck.loadCapacity, loadCapacity) == 0 && towingCapacity == truck.towingCapacity;
    }

}
