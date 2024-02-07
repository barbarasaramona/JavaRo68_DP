package design_patterns.creationale.factory;

public class Pc extends Computer {


    private Integer hdd;
    private Integer ram;

    public Pc(Integer ram, Integer hdd) {

        this.ram = ram;
        this.hdd = hdd;

    }

    @Override
    public String getRam() {
        return "PC ram: " + ram;
    }

    @Override
    public String getHdd() {
        return "PC hdd: " + hdd;
    }


}
