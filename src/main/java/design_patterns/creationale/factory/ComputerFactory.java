package design_patterns.creationale.factory;

import java.util.Scanner;

public class ComputerFactory {

    public static Computer getComputer(String tipComputer, Integer ram, Integer hdd){

            if("PC".equals(tipComputer)){

                return new Pc(ram,hdd);

            }else {
                System.out.print("Introduceti nr de componente: ");
                Scanner scanner = new Scanner(System.in);
                Integer nrComponente = scanner.nextInt();
                return new Server(ram, hdd, nrComponente);
            }

    }


}
