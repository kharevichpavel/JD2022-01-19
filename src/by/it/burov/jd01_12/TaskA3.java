package by.it.burov.jd01_12;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int zeroPosition = 0;
        while (true){
            String word = scan.next();
            if(!word.equals("end")){
                int value = Integer.parseInt(word);
                if(value==0){
                    integers.add(zeroPosition,value);
                }else if(value>0){
                    integers.add(zeroPosition++,value);
                }else {
                    integers.add(value);
                }
            }else {
                break;
            }
        }
        System.out.println(integers);
    }
}
