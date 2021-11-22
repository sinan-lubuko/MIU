import java.util.Scanner;

public class Chapter7 {
    public static void main(String [] args){
        String [] str = new String [5];
        Scanner keyboard = new Scanner(System.in);
        String s;
        System.out.println("Inter 5 String Value one by one");

        for(int i=0; i< str.length; i++){
            System.out.print("Enter a value of index:" +i + "");
             str[i] = keyboard.next();
        }
        System.out.print("End");
        for(int k=0; k< str.length;k++){
            System.out.print(str[k] + "");
        }
        System.out.println("]");
        String []fruits = {"apple","pine","apricot","banana","Lemon"};
        int count = 0;
        for(int j=0;j< str.length; j++){
            if(str[j].startsWith("a"));
            count++;
        }
        System.out.println("StartWith a count"+ "" +count);


    }
}
