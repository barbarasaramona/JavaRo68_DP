package design_patterns.structurale.adapter;

public class Cocos implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Cocosul nu prea zboara");
    }

    @Override
    public void makeSound() {
        System.out.println("Cucurigu");
    }
}
