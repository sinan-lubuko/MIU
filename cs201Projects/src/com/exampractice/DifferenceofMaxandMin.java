package com.exampractice;

public class DifferenceofMaxandMin {

    public static void main(String[] args){
        int[] arr = {34, 9, 23, 100, 67, 150, 209, 78};
        difference(arr);
    }

    public static void difference(int[]arr){
        int max = arr[0];
        int min = arr[0];

        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int difference = max-min;
        System.out.println(difference);
    }
}
