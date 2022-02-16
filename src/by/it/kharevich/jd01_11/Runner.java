package by.it.kharevich.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List <String> myList= new ArrayList<>();
        printList(myList);
        myList=new ListA<>();
        printList(myList);
        myList=new ListB<>();
        printList(myList);


    }

    private static void printList(List<String> myList) {
        System.out.printf("======== %s ========%n",myList.getClass().getSimpleName());
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");
        System.out.println(myList);

        myList.set(3,"oneone");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        String first = myList.get(0);
        String last = myList.get(3);
        System.out.printf("first=%s last=%s%n",first,last);

        System.out.println("Iteration loop");
        for (String s : myList) {
            System.out.print(s + "---");
        }
        System.out.println();
    }
}
