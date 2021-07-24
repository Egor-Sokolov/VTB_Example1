package com.company;

public class Cat extends Animal {

    public int maxRunCat = 200;
    String name;
  private  static int QuantityCat;

    public Cat(String name) {
        super(name);
        this.name = name;
        QuantityCat++;
    }


    @Override
    public void run(int distanceRunCat) {
        if (distanceRunCat > maxRunCat) {
            System.out.println(name + " Выдохся");
        } else {
            super.run(distanceRunCat);

        }
    }


    public void swim(int a) {
        System.out.println(name + " Утонул");
    }

    public static int QuantityCat() {
        return QuantityCat;
    }

    @Override
    public String toString() {
        return "Cat: " + name;
    }
}
