package w2d3;

import java.util.ArrayList;
import java.util.Scanner;

public class PetMainApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        while(true){
            System.out.println("Enter name of your pet: ");
            String name = scanner.nextLine();
            if(name.equals("STOP")){
                break;
            }
            System.out.println("Type d for dog or c for cat: ");
            String type = scanner.nextLine();
            Pet pet = new Pet(name, type.charAt(0));
            petList.add(pet);
        }

        for(Pet p: petList){
            System.out.println("Name: "+p.getName()+", type: "+p.getType());
        }
    }
}
