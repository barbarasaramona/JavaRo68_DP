package design_patterns.creationale.factory;

public class Main {

    public static void main(String[] args) {

        Computer server1 = new Server(16, 100, 3);
        Computer pc1 = new Pc(32, 100);

        System.out.println(server1.getRam());
        System.out.println(pc1.getRam());

        Computer server2 = ComputerFactory.getComputer("Server", 8, 60);
        Computer pc2 = ComputerFactory.getComputer("PC", 8, 200);

        System.out.println(server2.getHdd());
        System.out.println(pc2.getHdd());

        Computer server3 = ComputerFactory.getComputer(null, 8, 100);
        System.out.println(server3.getHdd());

    }


}
