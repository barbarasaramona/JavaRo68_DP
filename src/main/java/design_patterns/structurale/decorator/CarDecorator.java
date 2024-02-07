package design_patterns.structurale.decorator;

public class CarDecorator implements Car{
    protected Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public Integer changeHorsepower(Integer value) {
        return this.car.changeHorsepower(value);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.print("Decorating: ");
    }
}
