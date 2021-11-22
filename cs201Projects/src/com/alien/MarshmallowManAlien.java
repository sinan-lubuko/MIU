package com.alien;

public class MarshmallowManAlien extends Alien{
    public MarshmallowManAlien(int health, String name) {
        super(health, name);
    }

    public int getDamage(){
        return 1;
    }
}
