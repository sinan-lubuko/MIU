package com.oop;

import com.myutil.BookStore;

public class BookStoreTest {

    public static void main(String[] args){
        BookStore store = new BookStore();//default constructor
        store.setStoreID(100);
        store.setAuthor("Mr. Carlos");
        store.setBookCategory("Story");
        store.setPublisher("Wisely Inc.");
        store.setTitle("Kiddy Cat");
        store.setSellingPrice(12.99);
        store.setQuantity(29);
        System.out.println("Sold quantity: "+ store.trackSaleStatus());
        System.out.println("Available quantity: "+store.getAvailableQuantity());
        store.trackSaleStatus(3);
        System.out.println("Available quantity: "+store.getAvailableQuantity());
        store.trackSaleStatus(5);
        System.out.println("Available quantity: "+store.getAvailableQuantity());
        int totalSoldQuantity = store.trackSaleStatus();
        System.out.println("Sold quantity: "+ totalSoldQuantity);
        //System.out.println("Sold quantity: "+ store.trackSaleStatus());

        //String p = store.getPublisher();
        //System.out.println("Publisher: "+p);
    }
}
