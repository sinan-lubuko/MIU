package com.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CondonCollector {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> condonList = new ArrayList<>();

        while(true){
            System.out.println("Enter nucleotides");
            String str = scanner.nextLine();
            str = str.trim(); //remove trailing spaces
            if(str.isEmpty()){
                break;
            }

            for(int i = 0; i < str.length(); i = i+3){
                if(i+3 < str.length()){
                    String condon = str.substring(i, i+3);
                    condonList.add(condon);
                }
            }
        }

        //display using for-each
        System.out.println("Condons");
        for(String str: condonList){
            System.out.println(str);
        }
    }
}
