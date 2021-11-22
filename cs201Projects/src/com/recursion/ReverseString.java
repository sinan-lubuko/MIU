package com.recursion;

public class ReverseString {

    public static void main(String[] args){

        String str = "sample";
        String reversedString = reverse(str);
        System.out.println(reversedString);
    }

    public static String reverse(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        char ch = s.charAt(s.length()-1); //last character
        String sub = s.substring(0, s.length()-1);
        return ch + reverse(sub);
    }
}
