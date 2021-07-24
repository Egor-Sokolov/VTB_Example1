package com.company;



public class AnimalDemoApp {
    public static void main(String[] args) {
        Cat Barsik = new Cat("Барсик");
        Cat Fedia = new Cat("Федя");
        Cat Chepuha_Pyshistaia = new Cat("Чепуха Пушистая");
        Barsik.run(699);
        Barsik.run(25);
        Barsik.swim(49);
        System.out.println(Cat.QuantityCat());
        Cat[] cats = new Cat[3];
        System.out.println(Cat.QuantityCat());
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");
        System.out.println(Cat.QuantityCat());
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].toString());
        }
    }
}

