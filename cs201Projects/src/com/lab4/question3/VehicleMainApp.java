package com.lab4.question3;

public class VehicleMainApp {

    public static void main(String[] args){
        Person person = new Person("Katherine");
        //String manufacturerName, int numberOfCylinders, Person owner, double loadCapacity, int towingCapacity
        Vehicle v = new Truck("Toyota", 6, person, 3.5, 20);
        System.out.println(v.toString());
    }
}
