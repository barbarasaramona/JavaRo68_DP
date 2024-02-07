package design_patterns.creationale.abstractFactory;

public class PcFactory implements ComputerAbstracFactory {

    private Integer ram;
    private Integer hdd;

    public PcFactory(Integer ram, Integer hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram, hdd);
    }
}
