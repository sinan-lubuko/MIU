package Chapter3;

import java.util.Scanner;

public class CheckServiceFee {

    public static void main(String[] args) {
        double serviceFee = 0.0;
        double checkAmount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of Check");
        checkAmount = input.nextDouble();
        if (checkAmount < 10) {
            serviceFee = 1;
        }
        else
            if(checkAmount> 10&&checkAmount<100){
            serviceFee = checkAmount*0.1;
        }
        else
            if(checkAmount>100&&checkAmount<1000){
            serviceFee = 5+checkAmount*0.05;
        }
        else
            if(checkAmount>1000){
                serviceFee = 40 + checkAmount * 0.01;
            }
        System.out.println("Charge for Service is" +" " +'$' +serviceFee);
        }


    }
