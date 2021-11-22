package Chapter5;

public class CountingLetterA {


    public static void main(String[] args) {

        int count = 0;
        String str = "Java Programming";
        for (int index = 0; index < str.length(); index++)
            if (str.charAt(index) == 'a')
                count++;
        System.out.println("Number of a's: " + count);
    }
}