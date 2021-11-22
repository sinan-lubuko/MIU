package com.derartu;

public class Q3Main {
    public static void main(String[] args) {
        QuestionThree q3; //object declaration
        q3 = new QuestionThree(); //object creation

        q3.init(); //count =1

        q3.count = q3.increment() + q3.increment(); //count = 2 + 3

        System.out.println(q3.increment()); //6
    }
}