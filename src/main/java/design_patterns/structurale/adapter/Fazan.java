package design_patterns.structurale.adapter;

public class Fazan implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Fazanul zboara");
    }

    @Override
    public void makeSound() {
        System.out.println("Fazanul face sunet");
    }
}
