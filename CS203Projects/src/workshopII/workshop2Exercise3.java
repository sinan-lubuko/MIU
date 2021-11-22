package workshopII;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class workshop2Exercise3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number N: ");
        int N = scanner.nextInt();
        Random random = new Random();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./integers.txt"));
            for(int i = 0; i < N; i++){
                int number = random.nextInt();
                writer.write(String.valueOf(number));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
