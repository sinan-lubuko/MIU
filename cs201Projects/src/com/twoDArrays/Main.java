package com.twoDArrays;

public class Main {

    public static void main(String[] args){
        int[][] arr = new int[][] { {4, 6, 8, 5},
                                    {1, 6, 4},
                                    {4, 3, 2, 1} };
        displayElements(arr); //the method is called here
        System.out.println();
        int result = sumofElements(arr);
        System.out.println("Sum: "+result);

        int evenCount = countEvens(arr);
        System.out.println("Evens: "+ evenCount);

        double[] rowAverage = getRowsAverage(arr);
        System.out.println("Row Averages:");
        for(int i = 0; i < rowAverage.length; i++){
            System.out.print(rowAverage[i]+"  ");
        }

        String[][] str= new String[][]{ {"Hello Java", "This is Procedural", "Next is OOP"},
                                         {"Discrete Mathematics", "Calculus", "English"},
                                         {"Addis Ababa", "Chicago", "Dallas", "Ambo"},
                                         {"C++", "Programming"}};
        System.out.println();
        printLongStrings(str);
    }

    public static void displayElements(int[][] ar){
        for(int i =0;i < ar.length; i++){
            System.out.println();
             for(int j=0; j < ar[i].length; j++){
                 System.out.print(" "+ ar[i][j]); //print on same line for each row
            }
        }
    }

    public static int sumofElements(int[][] ar){
        int sum = 0;
        for (int i= 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) { //ar[i] => content of the row i
                sum = sum + ar[i][j];
            }
        }
        return sum;
    }

    public static int countEvens(int[][] ar){
        int count = 0;
        for(int i= 0; i < ar.length; i++){
            for(int j= 0; j < ar[i].length; j++){
                if(ar[i][j]%2==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static double[] getRowsAverage(int[][] ar){
        double[] average = new double[ar.length]; //ar.length => number of rows
        for(int i = 0;i < ar.length; i++){
            int sum = 0;
            for(int j=0; j < ar[i].length; j++){
                sum = sum + ar[i][j];
            }
            //sum => sum of values in the row i
            double avg = (double)sum/ar[i].length;  //ar[i].length => number of elements of row i
            average[i] = avg; //this average is for row i
        }
        return average;
    }

    public static void printLongStrings(String[][] strs){
        for(int i = 0; i < strs.length; i++){
           for(int j = 0; j < strs[i].length; j++){
               if(strs[i][j].length() > 10){
                   System.out.println(strs[i][j]);
               }
           }
        }
    }

}
