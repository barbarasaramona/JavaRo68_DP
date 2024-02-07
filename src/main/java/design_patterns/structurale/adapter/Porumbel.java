package design_patterns.structurale.adapter;

public class Porumbel implements BirdAction{
    @Override
    public void fly() {
        System.out.println("Porumbelul zboara");
    }

    @Override
    public void makeSound() {
        System.out.println("gulugulu");
    }
}
