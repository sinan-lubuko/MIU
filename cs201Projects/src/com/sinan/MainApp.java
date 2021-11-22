package com.sinan;

import java.io.FileReader;

public class MainApp {
    public static void main(String[] args) {
        Employee e1, e2;
        e1 = new Employee("Addissu","Guddissa", 10000);
        e2 = new Employee("Derartu","Abdisa",20000);
        System.out.println(e1.getFirstname());
        System.out.println(e2.getSalary());

        Address ad1, ad2;
        ad1 = new Address("Elowe Av", "fairfeild","iowa", "abc");
        ad2 = new Address("ftrshk", "hhbhdbh","hghghgh","hbvhbvhbv");
        System.out.println(ad1.getCity());
        System.out.println(ad2.getState());

        e1.setFirstname("Badhasa");
        e1.setHomeAddress(ad1);
        e1.setWorkAddress(ad2);

        System.out.println(e1.getFirstname());

        //Employee emp = null; //employee object declaration
        //String firstName = emp.getFirstname();
        //System.out.println(firstName);

        //String str1 = "5";
        //String str2 = "A";
        //System.out.println(Integer.valueOf(str1));

        //FileReader f = new FileReader("filename.txt");

    }
}
