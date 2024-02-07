import dayCreationale.singleton.ServerCollection;

public class Main {
    public static void main(String[] args) {



        ServerCollection server = ServerCollection.getInstance();
        ServerCollection server2 = ServerCollection.getInstance();
        server.addServer("http//:www.youtube.com");
        server.addServer("https//:www.youtube.com");
        server.addServer("htp//:www.youtube.com");
        server.addServer("http//:www.youtube.com");
        server2.addServer("https//:www.google.com");



        System.out.println(server.getServerList());
        System.out.println(server2.getServerList());

        System.out.println(server.getHttpsList());
        System.out.println(server.getHttpList());





    }
}