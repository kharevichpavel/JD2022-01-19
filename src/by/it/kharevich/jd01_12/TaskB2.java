package by.it.kharevich.jd01_12;

import java.util.*;

public class TaskB2 {

    public static final String[] peoplesName = {"Bill,Bob,Jho,Pole,Ann,Mao,Maik,Alex,Leon"};

    public static void main(String[] args) {
        List<String> peoples = new ArrayList<>();
        for (int i = 0; i < peoplesName.length; i++) {


        }
        process ((ArrayList<String>) peoples);

        System.out.println(" ");
    }

    static String process(ArrayList<String> peoples) {
        int i = 0;
        while (peoples.size() != 1) {
            for (i = 0; i < peoples.size(); i++) {
                peoples.set(i, null);
            }
            while (true) {
                if (!peoples.remove(null)) break;

            }
        }


        return peoples.get(i);
    }
//    static String process(LinkedList<String> peoples) {
//        return null;
//    }
}
