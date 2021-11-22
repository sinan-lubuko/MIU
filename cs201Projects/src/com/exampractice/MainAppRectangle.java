package com.exampractice;

public class MainAppRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        rectangle.area();
        rectangle.perimeter();
        Square square = new Square(6);
        square.area();
        square.perimeter();
    }
}