package com.exampractice;

public class FindPairSum {

    public static void findPairSum(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    System.out.println(arr[i] + " " + arr[j]);


                }

            }
        }

    }
}
