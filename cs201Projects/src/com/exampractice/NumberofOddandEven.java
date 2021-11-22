package com.exampractice;

public class NumberofOddandEven {
    public static void main(String[] args){
        int[] arr = {1,5,7,12,17,8,10};
         int numOfEven = 0;
         int numOfOdd = 0;

         for(int i =0; i < arr.length; i++){
             if(arr[i] % 2 == 0){
                 numOfEven = numOfEven + 1;
             }
             if (arr[i] % 2 !=0) {
                 numOfOdd = numOfOdd + 1;
             }

         }
              System.out.println(numOfEven);
              System.out.println(numOfOdd);

    }
}
