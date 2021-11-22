package com.derartu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LibraryCard {

    private GregorianCalendar expirationDate; //property called expiration date

    public LibraryCard(){ //default constructor
        expirationDate = new GregorianCalendar();
    }

    //sets the expiration date
    public void setExpDate(GregorianCalendar date) {
        expirationDate = date;
    }

    //returns the expiration year
    public int getExpYear( ) {
        //extract YEAR from expirationDate which is a GregorianCalendar
        int year = expirationDate.get(Calendar.YEAR);
        return year;
    }
    //returns the expiration month
    public int getExpMonth( ) {
        //extract MONTH from expirationDate which is a GregorianCalendar
        int month = expirationDate.get(Calendar.MONTH) + 1;
        return month;

    }
    //returns the expiration day
    public int getExpDay( ) {
        //extract DATE from expirationDate which is a GregorianCalendar
        int day = expirationDate.get(Calendar.DATE);
        return day;
    }

}
