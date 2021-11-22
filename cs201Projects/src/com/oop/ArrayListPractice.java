package com.oop;

import com.myutil.Employee123;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args){
       /* List<Double> temps = new ArrayList<>();
        temps.add(48.8);
        temps.add(58.2);
        temps.add(5.50);
        temps.add(58.2);
        temps.add(65.2);
        temps.add(72.5);
        temps.add(55.5);

        int num =temps.size();
        System.out.println(num);

        double maxValue = temps.get(0);

        for(int i = 0; i< temps.size(); i++){
            if(temps.get(i) > maxValue){
                maxValue = temps.get(i);
            }
        }
        System.out.println(maxValue);
        boolean isRemoved = temps.remove(48.8);
        System.out.println(isRemoved);
        System.out.println(temps.size());

        List <Double> myList = new ArrayList<>();
        for(int i =0;i< temps.size(); i++){
            if(temps.get(i)> 50){
                myList.add(temps.get(i));
            }
        }
        System.out.println(myList);
        myList.remove(58.2);
        temps.removeAll(myList);
        System.out.println(temps);
        temps.addAll(myList);
        System.out.println(temps);
        */

        Employee123 e1 = new Employee123("Derartu", 120000);
        Employee123 e2 = new Employee123("Sinan", 150000);
        Employee123 e3 = new Employee123("Addisu", 120022);
        Employee123 e4 = new Employee123("Girma", 110000);
        Employee123 e5 = new Employee123("Lemlem", 100000);

        List<Employee123> employee123List = new ArrayList<>();
        employee123List.add(e1);
        employee123List.add(e2);
        employee123List.add(e3);
        employee123List.add(e4);
        employee123List.add(e5);
        employee123List.add(new Employee123("Abdisa", 80000));

        for(int i = 0; i < employee123List.size(); i++){
            System.out.println(employee123List.get(i).getName());
        }

        double totalSalary = 0;
        for(int i = 0; i < employee123List.size(); i++){
            totalSalary = totalSalary + employee123List.get(i).getSalary();
        }
        System.out.println("Total salary: "+totalSalary);

        employee123List.remove(0);
        for(int i = 0; i < employee123List.size(); i++){
            System.out.println(employee123List.get(i).getName());
        }
    }
}

