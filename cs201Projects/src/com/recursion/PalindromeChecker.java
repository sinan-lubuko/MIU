package com.recursion;

public class PalindromeChecker {

    public static void main(String[] args){
        String str = "hannah";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s){
        if(s == null || s.length() <= 1){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
        else{
            String sub = s.substring(1, s.length()-1);
            return isPalindrome(sub);
        }
    }
}
