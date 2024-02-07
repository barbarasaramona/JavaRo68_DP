package design_patterns.creationale.abstractFactory;

public class Main {


    public static void main(String[] args) {

        Computer server1 = ComputerFactory.getComputer(new ServerFactory(16,32,2));
        System.out.println(server1.getHdd());

        Computer pc1 = ComputerFactory.getComputer(new PcFactory(16,200));
  //      System.out.println(pc1.getHdd());
    }
}
