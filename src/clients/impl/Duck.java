package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Owner;
import clients.Swimmable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimmable {

    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void addPatient(Animal animal) {
    }
    @Override
    public void eat() {
    }
    @Override
    public double fly() {
        return 2;
    }

    @Override
    public void swim() {
    }
    @Override
    public double run() {
        return 12;
    }
    public void addPatient(Object patient) {
    }
}

