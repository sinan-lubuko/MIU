package com.sinan;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {

    }

    public Address(String zip) {
        this.zip = zip;
    }

    public Address(String s, String c, String st, String z) {
        //street = s;
        //city = c;
        //state = st;
        //zip = z;
        this(z); //this => means the current object
        this.street = s;
    }

    public String getStreet() {
        return street;

    }

    public void setStreet(String s) {
        street = s;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String c) {
        city = c;
    }

    public String getState() {
        return state;
    }
    public void setState(String st){
        state = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String z) {
        zip = z;
    }
}





