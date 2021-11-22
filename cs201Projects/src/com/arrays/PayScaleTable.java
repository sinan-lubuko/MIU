package com.arrays;

public class PayScaleTable {

    public static void main(String[] args){

        double[][] pt;
        pt = new double[4][5];
        //row 0 => gradle 0
        pt[0][0] = 10.50;
        pt[0][1] = 12.00;
        pt[0][2] = 14.50;
        pt[0][3] = 16.75;
        pt[0][4] = 18.00;

        //row 1 => gradle 1
        pt[1][0] = 20.50;
        pt[1][1] = 22.25;
        pt[1][2] = 24.00;
        pt[1][3] = 26.25;
        pt[1][4] = 28.00;

        //row 2 => gradle 2
        pt[2][0] = 34.00;
        pt[2][1] = 36.50;
        pt[2][2] = 38.00;
        pt[2][3] = 40.35;
        pt[2][4] = 43.00;

        //row 3 => grade 3
        pt[3][0] = 50.00;
        pt[3][1] = 60.00;
        pt[3][2] = 70.00;
        pt[3][3] = 80.00;
        pt[3][4] = 99.99;

        //The average pay for every grade level (for the rows)
        double[ ] gradeAverage = { 0.0, 0.0, 0.0, 0.0 };
        for (int i = 0; i < pt.length; i++) { //rows
            int sum = 0;
            for (int j = 0; j < pt[i].length; j++) { //column
                sum += pt[i][j];
            }
            gradeAverage[i] = sum / pt[i].length;
        }

        //The average pay for every step (i.e., average of every column)
        int rows = 4;
        int columns = 5;
        double[ ] stepAverage = { 0.0, 0.0, 0.0, 0.0, 0.0 };
        for (int i = 0; i < columns; i++) { //columns
            int sum = 0;
            for (int j = 0; j < rows; j++) { //rows
                sum += pt[j][i];
            }
            stepAverage[i] = sum / pt.length;
        }
        //Display the averages
        System.out.println("\nGrade level average");
        for(int i = 0; i < gradeAverage.length; i++){
            System.out.print("   "+gradeAverage[i]);
        }
        System.out.println("\nStep level average");
        for(int i = 0; i < stepAverage.length; i++){
            System.out.print("   "+stepAverage[i]);
        }
    }
}
