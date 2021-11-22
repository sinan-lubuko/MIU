package com.alien;

public class Alien {
    protected int health; //0 = dead, 100 = full strength
    protected String name;

    public Alien(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public int getDamage(){
        return 0;
    }
}
