package com.recursion;

public class CharacterCounter {

    public static void main(String[] args){
        String s = "sample";
        int len = findLength(s);
        System.out.println("Length: "+len);
    }

    public static int findLength(String str){
        if(str == null || str.isEmpty()){
            return 0;
        }
        else {
            String sub = str.substring(1);
            return 1 + findLength(sub);
        }
    }

}
