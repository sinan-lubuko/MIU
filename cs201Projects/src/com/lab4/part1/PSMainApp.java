package com.lab4.part1;

public class PSMainApp {

    public static void main(String[] args){

        P p = new P();
        S s = new S();

        p.printInfo1(); //call method of parent class by object of parent class
        s.printInfo2(); //call method of child class by object of child class
        s.printInfo1(); //call method of parent class by object of child class
    }
}
