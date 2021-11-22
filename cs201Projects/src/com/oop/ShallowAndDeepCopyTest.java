package com.oop;

import com.myutil.Employee123;

public class ShallowAndDeepCopyTest {
    public static void main(String[] args){
        Employee123 e1 = new Employee123( "Anne", 50000);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
        e1.setName("bob");
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        Employee123 e2;
        e2 = e1;
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
        e2.setName("john");
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        Employee123 e3  = new Employee123(e1.getName(), e1.getSalary());
        System.out.println(e3.getName());
        System.out.println(e3.getSalary());
        e3.setName("drartu");
        System.out.println(e1.getName());
        System.out.println(e3.getName());
    }
}
