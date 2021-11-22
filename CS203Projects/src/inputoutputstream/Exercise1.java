package inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> girls = new ArrayList<>();
        ArrayList<String> boys = new ArrayList<>();
        addNamesFromFileToList("./girlnames.txt", girls);
        addNamesFromFileToList("./boynames.txt", boys);

        System.out.println("Enter a name: ");
        String name = scanner.next();
        String girlMessage = null;
        String boyMessage = null;

        for(int i = 0; i < girls.size(); i++){
            String[] girlInfo = girls.get(i).split(" ");
            if(girlInfo[0].equals(name)){
                girlMessage = name+" is ranked "+ (i+1)+ " in popularity among girls with "+girlInfo[1]+ " namings";
                break;
            }
        }
        for(int i = 0; i < boys.size(); i++){
            String[] boyInfo = boys.get(i).split(" ");
            if(boyInfo[0].equals(name)){
                boyMessage = name+" is ranked "+ (i+1)+ " in popularity among boys with "+boyInfo[1]+ " namings";
                break;
            }
        }
        if(girlMessage == null){
            girlMessage = name+ " is not ranked among the top "+girls.size()+" girl names";
        }
        if(boyMessage == null){
            boyMessage = name+ " is not ranked among the top "+boys.size()+" boy names";
        }
        System.out.println(girlMessage);
        System.out.println(boyMessage);
    }

    private static void addNamesFromFileToList(String filename, ArrayList<String> list){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            while(true){
                String nameWithPopularity = bufferedReader.readLine();
                if(nameWithPopularity == null){
                    break; //done reading from the file
                }
                list.add(nameWithPopularity);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
