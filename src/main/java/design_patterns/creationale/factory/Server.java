package design_patterns.creationale.factory;

public class Server extends Computer {

    private Integer ram;
    private Integer hdd;

    private Integer nrComponente;

    public Server(Integer ram, Integer hdd, Integer nrComponente) {

        this.ram = ram;
        this.hdd = hdd;
        this.nrComponente = nrComponente;
    }

    @Override
    public String getRam() {

        return "Server RAM: " + ram * nrComponente;
    }

    @Override
    public String getHdd() {
        return "Server HDD: " + hdd * nrComponente;
    }




}
