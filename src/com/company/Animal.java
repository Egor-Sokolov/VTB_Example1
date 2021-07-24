package com.company;

public class Animal {
    String name;


    public Animal(String name) {

        this.name = name;
    }

    public  void run(int a){
        System.out.println( this.name + " пробежал " + a + "м");

    }
   public void swim( int a){
       System.out.println( this.name + " проплыл " + a + "м");
    }


}
