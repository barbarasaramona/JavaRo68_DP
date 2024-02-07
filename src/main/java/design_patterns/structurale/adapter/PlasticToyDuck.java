package design_patterns.structurale.adapter;

public class PlasticToyDuck implements PlasticToyAction{
    @Override
    public void squeak() {
        System.out.println("Plastic duck squeaked");
    }
}
