package inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise5 {

    public static void main(String[] args){

        ArrayList<String> wordList = collectWordsFromFile("./wordBuff.txt");
        int count = 0;
        for(int i = 0; i < wordList.size(); i++){
            if(isPalindrome(wordList.get(i))){
                count++;
            }
        }
        System.out.println("Number of palindromes in the file: "+count);
    }

    private static ArrayList<String> collectWordsFromFile(String fileName){
        ArrayList<String> words = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("./wordBuff.txt"));
            while(true){
                String str = bufferedReader.readLine();
                if(str == null){
                    break;
                }
                String[] strAr = str.split(", ");
                for(int i = 0; i < strAr.length; i++){
                    words.add(strAr[i]);
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    private static boolean isPalindrome(String word){
        int i = 0; //first index
        int j = word.length()-1; //last index
        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
