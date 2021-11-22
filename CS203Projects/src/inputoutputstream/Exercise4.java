package inputoutputstream;

import java.io.*;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adviceString = readAdviceToFile("./advice.txt");
        System.out.println(adviceString); //display initial advice

        //ask the user to enter advice
        String anotherAdvice = "";
        System.out.println("Write your advice: ");
        while(true){
            String str = scanner.nextLine();
            if(str.isEmpty()){
                break;
            }
            anotherAdvice = anotherAdvice +"\n"+ str;
        }
        //write the new advice to a file
        writeAdviceToFile("./advice.txt", anotherAdvice);

    }

    private static String readAdviceToFile(String fileName){
        String adviceString = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while(true){
                String str = bufferedReader.readLine();
                if(str == null){
                    break;
                }
                adviceString = adviceString +"\n"+ str;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return adviceString;
    }

    private static void writeAdviceToFile(String fileName, String anotherAdvice){
        try {
            BufferedWriter  bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write(anotherAdvice);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
