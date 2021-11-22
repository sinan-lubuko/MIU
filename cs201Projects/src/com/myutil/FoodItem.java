package com.myutil;

public class FoodItem {
    private String name; //foodName
    private int points;

    public FoodItem(int points){
        this.points= points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
