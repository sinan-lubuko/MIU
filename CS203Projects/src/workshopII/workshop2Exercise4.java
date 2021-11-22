package workshopII;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class workshop2Exercise4 {

    public static void main(String[] args){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./integers.txt"));
            String numberStr = reader.readLine();
            while(numberStr != null){
                int number = Integer.parseInt(numberStr);
                if(number < smallest){
                    smallest = number;
                }
                if(number > largest){
                    largest = number;
                }
                sum = sum + number;
                count++;
                numberStr = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Smallest number: "+smallest);
        System.out.println("Largest number: "+largest);
        System.out.println("Average value: "+sum/count);
    }
}
