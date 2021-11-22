package com.arrays;

public class ArraysExample {

    /*
        write a method that finds the minimum value in the array and returns it
     */
    public static void main(String[] args){
        int[] arrayOne = {10, 30, 5, 15, 40, 10, 20, 60, 10};
        //1. At this point arrayOne is created and populated but ar is not created. ar does not exist before the method execution
        int minimum = findMin(arrayOne); // 2. calling the method below => both arrayOne and ar points to {10, 30, 5, 15, 40, 10, 20, 60, 10}
        //3. while the method findMin is being executed - the array elements are accessed by ar like ar[0], ar[1] etc

        //4. when the method findMin is done executing - ar is erased but arrayOne still points to {10, 30, 5, 15, 40, 10, 20, 60, 10}

        //Note: the value returned by the findMin method is assigned to the variable minimum

    }

    private static int findMin(int[] ar){
        int min = ar[ar.length];
        for(int num : ar){
            if(num < min){
               min = num;
            }
        }
        return min;
    }
}
