package inputoutputstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOReadPracticeMain {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./example.txt"));

            char ch = (char)reader.read(); //I
            System.out.println("I just read a character from a file");
            System.out.println("Character is: "+ch);
            ch = (char)reader.read();//space
            ch = (char)reader.read(); //a
            System.out.println("I just read another character from a file");
            System.out.println("Character is: "+ch);

            String str = reader.readLine();
            System.out.println("I just read a statement from a file");
            System.out.println("Statement is: "+str);

            str = reader.readLine();
            System.out.println("I just read another statement from a file");
            System.out.println("Statement is: "+str);

            str = reader.readLine();
            System.out.println("I just read another statement from a file");
            System.out.println("Statement is: "+str);

            str = reader.readLine();
            System.out.println("I just read another statement from a file");
            System.out.println("Statement is: "+str);
//done all of it
            str = reader.readLine(); //null
            System.out.println("I just read another statement from a file");
            System.out.println("Statement is: "+str);

            int code = reader.read(); //-1
            System.out.println("I just read another character from a file");
            System.out.println("Character is: "+code);


            //So, make sure we are checking for null when using readLine()
            //make sure we are checking -1 when using read()

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
