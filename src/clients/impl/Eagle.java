package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Owner;

import java.time.LocalDate;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void addPatient(Animal animal) {
    }
    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }
    public void EagleLifeCycle(){
        cleanFeathers();
        fly("mounts", "hunt");
        hunt();
    }
    private void cleanFeathers(){
        System.out.println(getType() + " cleans feathers");
    }
    private void fly(String place){
        System.out.println(getType() + " is flying to " + place);
    }
    private void fly(String place, String goal){
        System.out.println(getType() + "is flying to " + place + " for " + goal);
    }
    private void hunt(){
        System.out.println(getType() + " is hunting");
    }
    protected void swim(){
        System.out.println("Eagle cannot swim");
    }

    @Override
    public double fly() {
        return 7;
    }
    @Override
    public double run() {
        return 0;
    }
    public void addPatient(Object patient) {
    }
}
