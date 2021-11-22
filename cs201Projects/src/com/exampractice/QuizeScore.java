package com.exampractice;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeScore {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scorelist = new ArrayList<>();

        while(true){
            System.out.println("Enter Quize score");
            double score = scanner.nextDouble();
            if(score == -1){
                break;
            }
            scorelist.add(score);
        }
             double sumscore = 0.0;
            double averargeScore = 0.0;
        for(int i =0; i < scorelist.size();i++){
            sumscore = sumscore + scorelist.get(i);
        }
        averargeScore = sumscore/scorelist.size();
        System.out.println(averargeScore);


    }
}
