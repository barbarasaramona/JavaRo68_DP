package design_patterns.structurale.decorator;

public class LuxuryCar extends CarDecorator{
    private boolean areTapiterieS;
    public LuxuryCar(Car car) {
        super(car);
        this.areTapiterieS = true;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding tapiterie luxury: " + (areTapiterieS ? "Tapiterie luxury":"nu are tapiterie luxury"));
    }
}
