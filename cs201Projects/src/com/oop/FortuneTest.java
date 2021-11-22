package com.oop;

import com.myutil.Fortune;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FortuneTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Fortune fortune = new Fortune();
        List<String> fortuneList = new ArrayList<>();

        /*fortune.addToFortuneList("you will get 4.0 GPA this Semister");
        fortune.addToFortuneList("Happiness is Programming");
        fortune.addToFortuneList("Satisfation follows hard work");
        fortune.addToFortuneList("petince is Virtue");
        fortune.addToFortuneList("keep on pushing");*/

        fortuneList.add("you will get 4.0 GPA this Semister");
        fortuneList.add("Happiness is Programming");
        fortuneList.add("Satisfation follows hard work");
        fortuneList.add("petince is Virtue");
        fortuneList.add("keep on pushing");

        while(true){
            System.out.println("Fortune Y/N?");
            String choice = scanner.next();
            if("Y".equalsIgnoreCase(choice)) {
                //int randomIndex = random.nextInt(fortune.getFortuneSize());
                int randomIndex = random.nextInt(fortuneList.size());
                String msg = fortuneList.get(randomIndex);
                System.out.println(msg);
            }
            else{
                break;
            }
        }
    }
}