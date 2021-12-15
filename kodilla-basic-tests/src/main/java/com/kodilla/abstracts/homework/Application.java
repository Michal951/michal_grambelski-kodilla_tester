package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
       Square square = new Square(10);
        System.out.println("Pole kwadratu = " + square.getArea());
        System.out.println("Obwód kwadratu = " + square.getPerimiter());


        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Pole prostokatu = " + rectangle.getArea());
        System.out.println("Obwod prostokatu = " + rectangle.getPerimiter());


        Circle circle = new Circle(6);
        System.out.println("Pole kola = " + circle.getArea());
        System.out.println("Obwod kola = " + circle.getPerimiter());

    }
}