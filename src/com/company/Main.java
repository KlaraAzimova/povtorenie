package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setAty("Balyk");
        fish.setJashy(2);
        fish.setSalmagy(3);
        System.out.println(fish.getAty() + " " + fish.getJashy() + " " + fish.getSalmagy());

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(4);
        cat.setParoda("Regdol");
        cat.setWeiht(3);
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getParoda() + " " + cat.getWeiht());

        Dog dog = new Dog();
        dog.setName("Aktosh");
        dog.setAge(6);
        dog.setWeiht(12);
        dog.setBreed("Basendji");
        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getWeiht() + " " + dog.getBreed());

        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        parrot.setAge(6);
        parrot.setSolor("green");
        System.out.println(parrot.getName() + " " + parrot.getAge() + " " + parrot.getColor());

    }
}
