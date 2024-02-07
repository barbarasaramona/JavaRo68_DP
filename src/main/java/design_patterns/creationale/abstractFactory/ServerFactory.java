package design_patterns.creationale.abstractFactory;

public class ServerFactory implements ComputerAbstracFactory {

    private Integer ram;
    private Integer hdd;
    private Integer nrComponente;

    public ServerFactory(Integer ram, Integer hdd, Integer nrComponente) {
        this.ram = ram;
        this.hdd = hdd;
        this.nrComponente = nrComponente;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, nrComponente);
    }

}
