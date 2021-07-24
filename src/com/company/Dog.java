package com.company;

public class Dog extends Animal {
    String name;
    private  static int KolVoDog;
    public Dog(String name) {
        super(name);
        KolVoDog++;
    }

    @Override
    public void run(int a) {
        if(a > 500){
            System.out.println(super.name + "Выдохся");
        }

        super.run(a);
    }

    @Override
    public void swim(int a) {
        if(a > 10){
            System.out.println(super.name + "Утонул");
        }

        super.swim(a);
    }

    public static int KolvoDog() {
        return KolVoDog;
    }
}
