package by.it.yushkevich.jd01_12;

import java.util.HashMap;
import java.util.Scanner;

public class TaskC1 {

    static HashMap<Integer, String> map = new HashMap<>();


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        //Filling map
        while (scanner.hasNext()) {
            String text = scanner.next();
            if (!text.equals("end")) {
                map.put(counter,text);
                counter++;
            } else {
                break;
            }
        }
        System.out.println(map.toString());

       // map.




    }
}
