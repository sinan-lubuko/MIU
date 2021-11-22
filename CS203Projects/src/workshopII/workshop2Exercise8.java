package workshopII;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class workshop2Exercise8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Exchange");
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter currency to: ");
        String currencyTo = scanner.nextLine();
        System.out.println("Enter currency from: ");
        String currencyFrom = scanner.nextLine();

        ArrayList<String> currencyList = new ArrayList<>();
        ArrayList<Double> exchangeRate = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./rate.txt"));
            String rate = reader.readLine();
            while(rate != null){
                int indexOfAmount = rate.lastIndexOf(" ");
                currencyList.add(rate.substring(0, indexOfAmount));
                exchangeRate.add(Double.parseDouble(rate.substring(indexOfAmount+1)));
                rate = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int toRateIndex = -1;
        int fromRateIndex = -1;
        for(int i = 0; i < currencyList.size(); i++){
            if(currencyList.get(i).equalsIgnoreCase(currencyTo)){
                toRateIndex = i;
            }
            if(currencyList.get(i).equalsIgnoreCase(currencyFrom)){
                fromRateIndex = i;
            }
        }
        if(toRateIndex == -1 || fromRateIndex == -1){
            System.out.println("No Exchange is not currently available");
        }
        else{
            double exchange = amount * exchangeRate.get(toRateIndex)/exchangeRate.get(fromRateIndex);
            System.out.println("Exchanged amount: "+exchange);
        }

    }
}
