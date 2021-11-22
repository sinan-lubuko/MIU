package com.exampractice;

public class ZerosToEnd {

    public static void main(String[] args){
        int[] ar = {2, 0, 3, 9, 0, 0, 6, 7, 12};
        int i = 0;
        int j = ar.length -1;
        while(i < j){
            if(ar[i] != 0){
                i++;
            }
            else if(ar[j] == 0){
                j--;
            }
            else if(ar[i] == 0 && ar[j] != 0) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        for(int x =0; x < ar.length; x++){
            System.out.print(ar[x]+" ");
        }

    }
}
