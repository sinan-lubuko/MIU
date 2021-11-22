package workshopII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class workshop2Exercise1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter words one after another. Enter STOP to stop entering words");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./words.txt"));
            String word = scanner.next();
            while(!word.equalsIgnoreCase("STOP")){
                writer.write(word);
                writer.newLine();
                word = scanner.next();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
