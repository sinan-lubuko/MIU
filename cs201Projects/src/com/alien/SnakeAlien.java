package com.alien;

public class SnakeAlien extends Alien {

    public SnakeAlien(int health, String name) {
        super(health, name);
    }

    public int getDamage(){
        return 10;
    }
}
