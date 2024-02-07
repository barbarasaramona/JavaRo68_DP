package design_patterns.structurale.decorator;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar("white", 100);
        Car sportsCar = new SportsCar(basicCar,30);
        Car luxuryCar = new LuxuryCar(sportsCar);

        Car luxurySportCar = new SportsCar(new LuxuryCar(new BasicCar("pink",180)), 50);

        Car utilityCar = new UtilitaryCar(new BasicCar("red", 230));

        basicCar.assemble();
        System.out.println();
        sportsCar.assemble();
        System.out.println();
        luxuryCar.assemble();
        System.out.println();
        luxurySportCar.assemble();
        System.out.println();
        utilityCar.assemble();
    }
}
