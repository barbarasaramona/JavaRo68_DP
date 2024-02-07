package design_patterns.structurale.decorator;

public class UtilitaryCar extends CarDecorator{
    public UtilitaryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding utility functions");
    }
}
