package Chapter5;

import java.util.Scanner;

public class CharacterCounter {

public static void min(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a text");
    int count = 0;
    String str;
    str = keyboard.next();

    for(int i= 0;i<str.length()-1;i++){
        if(str.charAt(i)=='a'&&str.charAt(i)=='A')
            count++;
    }
        System.out.println(count);
}
}

