package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskC1 {

    public static int counter = 0;

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String entry = scanner.next();
            if (entry.equals("end")) {
                break;
            } else {
                map.put(counter, entry);
                counter++;
            }
        }

        //TODO continue
        /*for (Map.Entry<UUID, String> entry : entries) {
            if (entry.) {

            }
        }*/
    }
}
