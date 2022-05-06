package com.company;

public class Main {

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setAty("Balyk");
        fish.setJashy(2);
        fish.setSalmagy(3);
        System.out.println(fish.getAty() + " " + fish.getJashy() + " " + fish.getSalmagy());

        Fish fish1 = new Fish();
        fish1.setAty("Sima");
        fish1.setJashy(1);
        fish1.setSalmagy(2);
        System.out.println(fish1.getAty() + " " + fish1.getJashy() + " " + fish1.getSalmagy());

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(4);
        cat.setParoda("Regdol");
        cat.setWeiht(3);
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getParoda() + " " + cat.getWeiht());

        Cat cat1 = new Cat();
        cat1.setName("Myshyk");
        cat1.setAge(2);
        cat1.setParoda("Regdol");
        cat1.setWeiht(1);
        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getParoda() + " " + cat1.getWeiht());

        Dog dog = new Dog();
        dog.setName("Aktosh");
        dog.setAge(6);
        dog.setWeiht(12);
        dog.setBreed("Basendji");
        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getWeiht() + " " + dog.getBreed());

        Dog dog1 = new Dog();
        dog1.setName("Jolbors");
        dog1.setAge(2);
        dog1.setWeiht(5);
        dog1.setBreed("Basendji");
        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getWeiht() + " " + dog1.getBreed());


        Parrot parrot = new Parrot();
        parrot.setName("Popugai");
        parrot.setAge(6);
        parrot.setSolor("green");
        System.out.println(parrot.getName() + " " + parrot.getAge() + " " + parrot.getColor());

        Parrot parrot1 = new Parrot();
        parrot1.setName("Kesha");
        parrot1.setAge(6);
        parrot1.setSolor("green");
        System.out.println(parrot1.getName() + " " + parrot1.getAge() + " " + parrot1.getColor());

    }
}
