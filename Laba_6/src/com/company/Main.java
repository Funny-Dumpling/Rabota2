package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Animal zoo = new Animal();
        zoo.makeNoise();
        zoo.sleep();
        zoo.eat();
        Veterinar doctor = new Veterinar();
        doctor.treatAnimal();
    }
}
class Animal {
    public void makeNoise() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, что делает животное");
        String make = in.nextLine();
        System.out.println("Животное - " + make);
    }
    public void eat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, что ест животное");
        String food = in.nextLine();
        System.out.println("Животное ест " + food);
    }
    public void sleep() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите, где спит животное");
        String location = in.nextLine();
        System.out.println("Животное спит - " + location);
    }
}
class Dog extends Animal {
    String Dog1 = "this.Dog1";
    @Override
    public void sleep() {
        String Dog1 = new String("не спит");
    }
    @Override
    public void eat() {
        String Dog1 = new String("ест");
    }

}
class Cat extends Animal {
    String Cat1 = "this.Cat1";
    @Override
    public void makeNoise() {
        String Cat1 = new String("не спит");
    }
    @Override
    public void eat() {
        String Cat1 = new String("ест");
    }
}
class Horse extends Animal {
    String Horse1 = "this.Horse1";
    @Override
    public void makeNoise() {
        String Horse1 = new String("не спит");
    }
    @Override
    public void eat() {
        String Horse1 = new String("ест");
    }
}
class Veterinar{
    public void treatAnimal(){
        Animal Cat1 = new Cat();
        Animal Horse1 = new Horse();
        Animal Dog1 = new Dog();
    }
}
