package com.lab4.question3;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person theObject) {
        this.name = theObject.name; //deep copy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name=" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Person person = (Person) o;
        return this.name.equals(person.name);
    }

}
