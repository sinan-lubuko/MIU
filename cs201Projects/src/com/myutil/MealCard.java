package com.myutil;

public class MealCard {
    private int balance;
    private Student student;

    public MealCard() {
        this.balance = 100; //initial balance
    }

    public MealCard(int balance, Student student) throws Exception {
        if(this.balance <= 0 ) {
            throw new Exception("Insufficient Balance");
        }
        this.balance = balance;
        this.student = student;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void addBalance(int balance){
        this.balance = this.balance + balance;
    }
    public void purchaseFood(FoodItem food) throws Exception {
        int points = food.getPoints();
        if(this.balance <= 0 || this.balance < points) {
            throw new Exception("Insufficient Balance");
        }
        this.balance = this.balance - points;

    }
}


