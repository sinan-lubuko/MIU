package com.oop;

public class InheritancePractice {
    public static void main(String [] args){
        B b = new B("Derarutu" ,100);
        C c = new C("Tolosa", 200);
        System.out.println(b.getName());
        System.out.println(b.getCount());
        A a = new A(10);
        System.out.println(a.getCount());
    }
}
