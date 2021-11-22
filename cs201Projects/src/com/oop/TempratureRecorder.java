package com.oop;

public class TempratureRecorder {
    public static void main(String[] args) {
        double[] temp = new double[365];
        int hotestDayIndex = 0;
        int coldestDayIndex = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > temp[hotestDayIndex]) {
                hotestDayIndex = i;

            }
            if (temp[i] < temp[coldestDayIndex]) {
                coldestDayIndex = i;
            }
        }

    }
}










