package workshopII;

import java.io.*;
import java.util.ArrayList;

public class workshop2Exercise9 {

    public static void main(String[] args){
        StringBuffer template = new StringBuffer();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("template.txt"));
            String line = reader.readLine();
            while(line != null){
                template.append(line);
                template.append("\n");
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("seniors.txt"));
            String line = reader.readLine();
            while(line != null){
                StringBuffer stringBuffer = new StringBuffer(template);
                String[] seniorInfo = line.split(", ");
                //stringBuffer.replaceA
                int indexOfName = stringBuffer.indexOf("<<N>>");
                while(indexOfName != -1){
                    stringBuffer.replace(indexOfName, indexOfName+5, seniorInfo[0]);
                    indexOfName = stringBuffer.indexOf("<<N>>");
                }

                int indexOfAge = stringBuffer.indexOf("<<A>>");
                while(indexOfAge != -1){
                    stringBuffer.replace(indexOfAge, indexOfAge+5, seniorInfo[1]);
                    indexOfAge = stringBuffer.indexOf("<<N>>");
                }

                int indexOfGender = stringBuffer.indexOf("<<G>>");
                while(indexOfGender != -1){
                    stringBuffer.replace(indexOfGender, indexOfGender+5, seniorInfo[2]);
                    indexOfGender = stringBuffer.indexOf("<<G>>");
                }
                System.out.println(stringBuffer.toString());
                System.out.println();
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
