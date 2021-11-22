package workshopII;

import java.io.*;
import java.util.Scanner;

public class workshop2Exercise2 {

    public static void main(String[] args){
        int wordsCount = 0;
        int totalLength = 0;
        String shortest = "";
        String longest = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./words.txt"));
            String word = reader.readLine();
            while(word != null){
                if(wordsCount == 0){
                    shortest = word;
                    longest = word;
                }
                else{
                    if(word.length() < shortest.length()){
                        shortest = word;
                    }
                    if(word.length() > longest.length()){
                       longest = word;
                    }
                }
                wordsCount++;
                totalLength = totalLength + word.length();
                word = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Shortest word: "+shortest);
        System.out.println("Longest word: "+longest);
        System.out.println("Average length: "+totalLength/wordsCount);
    }
}
