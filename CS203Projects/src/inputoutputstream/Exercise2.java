package inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args){
        String str = readMyFile("./numbers.txt");
        String[] numbers = str.split(" ");
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            int num = Integer.parseInt(numbers[i]);
            if(num == 10){
                count++;
            }
        }
        System.out.println("Total occurrences: "+count);

    }

    private static String readMyFile(String fileName){
       String content = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while(true){
                String str = bufferedReader.readLine();
                if(str == null){
                    break;
                }
                content = content + " "+str;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.trim();
    }
}
