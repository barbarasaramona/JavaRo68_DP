package design_patterns.structurale.decorator;

public class BasicCar implements Car{

    private String colour;
    private Integer horsepower;
    public BasicCar(String colour, Integer horsepower) {
        this.colour = colour;
        this.horsepower = horsepower;
    }

    @Override
    public Integer changeHorsepower(Integer value) {
        this.horsepower += value;
        return this.horsepower;
    }

    @Override
    public void assemble() {
        System.out.println("Pregatim masina basic of " + horsepower + " horsepower and it is " + colour);
    }
}
