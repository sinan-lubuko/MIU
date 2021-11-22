package com.myutil;

public class BookStore {

    private static int numberOfBooksSold = 0;

    private int storeID;
    private String author;
    private String title;
    private String publisher;
    private double sellingPrice;
    private int quantity;
    private String bookCategory;

    public BookStore() {
        this.storeID = 0;
        this.quantity = 0;
        this.sellingPrice = 0.0;
        this.author = "Unknown Author";
        this.title = "Unknown Title";
        this.publisher = "Unknown Publisher";
        this.bookCategory = "Kids"; //default category
    }

    public BookStore(int id, String Author, String title, String publisher, int quantity, String bookCategory) {
        this.storeID = id;
        this.author = Author;
        this.title = title;
        this.publisher = publisher;
        this.quantity = quantity;
        this.bookCategory = bookCategory;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int trackSaleStatus(int quantity) {
        numberOfBooksSold  = numberOfBooksSold + quantity;
        return numberOfBooksSold;
    }

    public int trackSaleStatus() {
        return this.trackSaleStatus(0);
    }

    public int getAvailableQuantity (){
        return quantity - numberOfBooksSold;
    }
}

























