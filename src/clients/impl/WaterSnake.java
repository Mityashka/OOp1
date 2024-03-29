package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimmable;

import java.time.LocalDate;

public class WaterSnake extends Animal implements Swimmable {
    public void addPatient(Animal animal) {
    }
    public WaterSnake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    @Override
    public void eat() {
        System.out.println("Snake eats");
    }
    public void SnakeLifeCycle(){
        fly();
    }
    protected void fly(){
        System.out.println("Snake cannot fly.");
    }

    @Override
    public void swim() {
    }
    public double run() {
        return 0;
    }
    public void addPatient(Object patient) {
    }
}
