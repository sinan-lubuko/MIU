package w2d4;

import java.util.ArrayList;
import java.util.Collections;

public class SortByTemperatureMainApp {

    public static void main(String[] args){

        ArrayList<City> cityList = new ArrayList<>();
        City city1 = new City("LA", 45.7);
        City city2 = new City("NY", 40.0);
        City city3 = new City("Miami", 45.7);
        City city4 = new City("DC", 95.0);
        City city5 = new City("Dallas", 27.4);
        City city6= new City("Fairfield", 55.5);
        City city7 = new City("Baltimore", 75.9);
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        cityList.add(city5);
        cityList.add(city6);
        cityList.add(city7);
        System.out.println("before sort");
        System.out.println(cityList);
        Collections.sort(cityList); //sort method uses compareTo to compare the objects and sort them
        System.out.println("after sort");
        System.out.println(cityList);
        // Collections.reverseOrder() changes the oder from ASC to DESC or vice-versa

    }
}
