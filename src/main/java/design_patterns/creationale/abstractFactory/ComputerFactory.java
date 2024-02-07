package design_patterns.creationale.abstractFactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstracFactory computer) {
        return computer.createComputer();
    }

}
