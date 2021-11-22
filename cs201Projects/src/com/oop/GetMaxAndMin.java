package com.oop;

 public class GetMaxAndMin {

     public static String getMaxAndMin(int[] arr) {
         int max = arr[0];
         int min = arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }
             if (arr[i] < min) {
                 min = arr[i];
             }
         }
         String result = max + " is the maximum and the minimum is " + min;
         return result;
     }

     public static void main(String[] args){
         int[] arr = {1,4,-9,33,19,78,5};
         String m = getMaxAndMin(arr);
         System.out.println(m);
     }
 }














