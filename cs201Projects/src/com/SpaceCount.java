package com;

import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char letter;
        System.out.println("Your name:");
        String name = scanner.next();
        int numberOfCharacters = name.length();
        int vowelCount = 0;
        for (int i = 0; i < numberOfCharacters; i++) {
            letter = name.charAt(i);
            if ( letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U'
            ) {
                vowelCount++;
            }
        }
        System.out.print(name + ", your name has " + vowelCount + " vowels");

        System.out.println("\n");
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = str1; //str3 and str1 points to same object => str1 == str3
        if (str1 == str2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        if (str1 == str3) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        String str4 = new String("Java");
        String str5 = new String("Java");
        if (str4.equals(str5)) { //equalsIgnoreCase
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
//when the first one is bigger, returns positive ....
        String name1 = new String("addisu");
        String name2 = new String("Derartu");
        int x = name1.compareTo(name2); //positive , 0, negative
        System.out.println(name1+" compareTo "+name2+" returns "+x);

        name1 = "   Sin an      "; //3space-Sin an-6space => length=15
        System.out.println(name1);
        System.out.println("Length: "+name1.length()); //15
        name1= name1.trim();
        System.out.println("Length: "+name1.length());//6
        System.out.println(name1);

        String s1 = "Biology";
        String s2 = "ology";
        String s3 = "bio";
        boolean b1  = s1.endsWith(s2);
        boolean b2 = s1.startsWith(s3);

        System.out.println(b1);
        System.out.println(b2); //false because of case
        System.out.println(s1.startsWith("Bio"));
        System.out.println("Addisu".startsWith("Addisu"));
        System.out.println("Addisu".endsWith("Addisu"));

        String word1 = "java";
        System.out.println("word1: "+word1);
        String word2 = word1.substring(0, 2);
        System.out.println("word1: "+word1);
        String word3 = word1.replace('j', 'w');
        System.out.println("word1: "+word1);////?????
        System.out.println("word2: "+word2);
        System.out.println("word3: "+word3);

        String first = "Donald";
        String middle = "John";
        String last = "Trump";
        StringBuffer full = new StringBuffer(first);
        full.append(" ");
        full.append(middle);
        full.append(" ");
        full.append(last);
        System.out.println(full.toString()); //efficient

        String fullName = first + " "+ middle +" "+ last; //not efficient
        System.out.println(fullName);


    }
}
