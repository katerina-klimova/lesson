package com.company;

public class Dog {
    public int height;
    public String color;

    public Dog(int height, String color){
        this.height = height;
        this.color = color;
    }


    public void doBark(String name){
        System.out.println("Bark " + name + " , мой рост: " + height + " " + color);
    }
    //<модификатор доступа> <возвращаемый тип> <имя> ([Тип_параметра имя_параметра])
}
