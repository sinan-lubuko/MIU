package com.lab4.part1;

public class Address {
    private String streetName;
    private String zipCode;
    private String state;

    public Address(String streetName, String zipCode, String state) {
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}


