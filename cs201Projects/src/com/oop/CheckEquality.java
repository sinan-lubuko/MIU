package com.oop;

public class CheckEquality{
    public static void main(String[] args){
        int[] arr1 = {1,3,5,6,6,7};
        int[] arr2 = {1,3,5,6,6,7};

        boolean b1 = areEqual(arr1, arr2);
        System.out.println("Arrays are equal: "+b1);
    }

   private static boolean areEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
   }

 }





