package design_patterns.structurale.decorator;


public class SportsCar extends CarDecorator{
    private Integer horsepowerToAdd;
    public SportsCar(Car car, Integer horsepowerToAdd) {
        super(car);
        this.horsepowerToAdd = horsepowerToAdd;

    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sports tuning: " + super.changeHorsepower(horsepowerToAdd));
    }
}
