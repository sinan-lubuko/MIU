package inputoutputstream;

import sale_and_discount.Sale;
import w2d3.Employee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOWritePracticeMain {
    public static void main(String []args){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./example.txt", true));
            //BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/derartuabdisa/Desktop/example.txt"));
           String str = "I am trying to write to a file";
            Sale s = new Sale("Grand Sale", 299.99);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
