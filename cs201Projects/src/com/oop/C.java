package com.oop;

public class C extends A {
    private String name;

    public C() {
        super();
    }
    public C(String name, int count){
        super(count);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
