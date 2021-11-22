package com.alien;

public class OgreAlien extends Alien {
    public OgreAlien(int health, String name) {
        super(health, name);
    }

    public int getDamage(){
        return 6;
    }
}
