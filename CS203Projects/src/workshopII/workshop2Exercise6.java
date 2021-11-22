package workshopII;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class workshop2Exercise6 {

    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myHtmlFile.txt"));
            String word = reader.readLine();
            while(word != null){
                int indexOfLink = word.indexOf("<LINK");
                int endIndex = word.indexOf("/>");
                while(indexOfLink != -1 && endIndex != -1){
                    String beginning = "<LINK href=";
                    int startIndex = beginning.length() + 1;
                    String webAddress = word.substring(startIndex, endIndex-1);
                    System.out.println("Web Address: "+webAddress);
                    word = word.substring(endIndex);
                    indexOfLink = word.indexOf("<LINK");
                    endIndex = word.indexOf("/>");
                }
                word = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
