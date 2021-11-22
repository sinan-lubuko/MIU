package com.alien;


public class AlienMainApp {

    public static void main(String[] args){
        Alien snake1 = new SnakeAlien(100, "SNAKE01");
        Alien snake2 = new SnakeAlien(100, "SNAKE02");
        Alien ogre1 = new OgreAlien(100, "OGRE01");
        Alien ogre2 = new OgreAlien(100, "OGRE02");
        Alien marshmallow1 = new MarshmallowManAlien(100, "MARSHMALLOW01");
        Alien marshmallow2 = new MarshmallowManAlien(100, "MARSHMALLOW02");

        AlienPack alienPack = new AlienPack(6);
        alienPack.addAlien(snake1, 0);
        alienPack.addAlien(snake2, 1);
        alienPack.addAlien(ogre1, 2);
        alienPack.addAlien(ogre2, 3);
        alienPack.addAlien(marshmallow1, 4);
        alienPack.addAlien(marshmallow2, 5);
        int totalDamage = alienPack.calculateDamage();
        System.out.println("Total damage = "+totalDamage);
    }
}
