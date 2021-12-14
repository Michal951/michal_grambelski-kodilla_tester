package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        kwadrat.Obwod();
        kwadrat.Pole();
        kwadrat.a = 5;
        System.out.println("Pole kwadratu = " + kwadrat.Pole());
        System.out.println("Obwód kwadratu = " + kwadrat.Obwod());


        Prostokat prostokat = new Prostokat();
        prostokat.Obwod();
        prostokat.Pole();
        prostokat.a = 5;
        prostokat.b = 3;
        System.out.println("Pole prostokatu = " + prostokat.Pole());
        System.out.println("Obwod prostokatu = " + prostokat.Obwod());


        Kolo kolo = new Kolo();
        kolo.Obwod();
        kolo.Pole();
        kolo.r = 3;
       kolo.PI = 3.14;
        System.out.println("Pole kola = " + kolo.Pole());
        System.out.println("Obwod kola = " + kolo.Obwod());

    }
}
