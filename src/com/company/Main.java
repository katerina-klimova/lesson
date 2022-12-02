package com.company;

public class Main {

    public static void main(String[] args) {
        String color = "Black";
        Dog myDog = new Dog(8, color);
        myDog.doBark("Шарик");
        System.out.println(myDog.toString());
    }
}