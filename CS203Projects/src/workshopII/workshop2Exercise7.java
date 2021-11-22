package workshopII;

import java.io.*;
import java.util.ArrayList;

public class workshop2Exercise7 {

    public static void main(String[] args){
        ArrayList<String> webAddresses = new ArrayList<>();
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
                    webAddresses.add(webAddress);
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

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./webAddresses.txt"));
            for(String webAddress: webAddresses){
                writer.write(webAddress);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
