package com.oop;

public class B extends A{
    private String name;

    public B(){
        super();
    }
    public B(String name, int num){
        super(num);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
