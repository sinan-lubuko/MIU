package com.myutil;

import java.util.ArrayList;
import java.util.List;

public class Fortune {

    private List<String> fortuneList;

    public Fortune(){
        this.fortuneList = new ArrayList<>(); //creates an arrayList
    }

    public void addToFortuneList(String msg){
        this.fortuneList.add(msg);
    }

    public String getFortuneFromList(int index){
        return this.fortuneList.get(index);
    }

    public int getFortuneSize(){
        return this.fortuneList.size();
    }

}
