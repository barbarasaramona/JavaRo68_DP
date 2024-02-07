package design_patterns.creationale.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServerCollection {

    private static ServerCollection instance = new ServerCollection();

    private List<String> serverList;

    private ServerCollection() {

        serverList = new ArrayList<>();

    }

    public List<String> getServerList() {
        List<String> listCopie = new ArrayList<>();
        // Shallow copy
//        listCopie = serverList;
//      Deep copy
        listCopie.addAll(serverList);   // =
//        for(int i =0; i<serverList.size();i++){
//
//            listCopie.add(serverList.get(i));
//
//        }
        return listCopie;
    }


// Lazy
//
//    private static ServerCollection instance;
//
//    public static ServerCollection getInstance() {
//        if (instance == null) {
//
//
//            instance = new ServerCollection();
//            System.out.println("Serverul a fost initializat.");
//
//        }
//
//        return instance;
//
//    }


    public static ServerCollection getInstance() {

        return instance;

    }

    public boolean addServer(String serverLink) {

        if ((serverLink.startsWith("http") || serverLink.startsWith("https")) && !serverList.contains(serverLink)) {

            serverList.add(serverLink);
            System.out.println("S-a adaugat in lista");
            return true;

        }
        System.out.println("Nu s-a adaugat");
        return false;

    }

    public List<String> getHttpList() {

        List<String> httpList = new ArrayList<>();
        for (String element : serverList) {

            if (element.startsWith("http/")) {
                httpList.add(element);
            }

        }
        return httpList;
    }

//    public List<String> getHttpsList() {
//
//        List<String> httpsList = new ArrayList<>();
//        for (String element : serverList) {
//
//            if (element.startsWith("https/")) {
//                httpsList.add(element);
//            }
//
//        }
//        return httpsList;
//    }

    // implementare cu Stream

    public List<String> getHttpsList() {

        return serverList.stream().filter(element->element.startsWith("https/")).collect(Collectors.toUnmodifiableList());

    }


}
