package inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise3 {

    public static void main(String[] args){
        ArrayList<Double> values =  readDoubles("./doubles.txt");
        double sum = 0;
        for(int i = 0; i < values.size(); i++){
            sum = sum + values.get(i);
        }
        double average = sum/values.size();
        System.out.println("Average: "+average);

    }

    private static ArrayList<Double> readDoubles(String fileName){
        ArrayList<Double> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while(true){
                String numString = bufferedReader.readLine();
                if(numString == null){
                    break;
                }
                double value = Double.parseDouble(numString);
                list.add(value);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


}
