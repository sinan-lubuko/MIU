package workshopII;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class workshop2Exercise5 {

    public static void main(String[] args){
        int linkTagCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myHtmlFile.txt"));
            String word = reader.readLine();
            while(word != null){
                String[] wordsArr = word.split(" ");
                for(String str: wordsArr){
                    if(word.equalsIgnoreCase("<LINK")){
                        linkTagCount++;
                    }
                }
                word = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("<LINK tag count: "+linkTagCount);
    }
}
