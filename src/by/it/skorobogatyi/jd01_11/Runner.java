package by.it.skorobogatyi.jd01_11;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        processListA();

        processListB();

        processSetC();
    }

    private static void processListA() {
        System.out.println("-".repeat(10) + "Start processing ListA" + "-".repeat(10));
        ListA myList =  new ListA();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        String first = (String) myList.get(0);
        String last = (String) myList.get(myList.size() - 1);
        System.out.printf("first = %s, last = %s%n", first, last);
        System.out.println("-".repeat(10) + "End processing ListA" + "-".repeat(10));
        System.out.println();
    }

    private static void processListB() {
        System.out.println("-".repeat(10) + "Start processing ListB" + "-".repeat(10));

        ListB myList =  new ListB();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        myList.add("five");
        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

        String first = (String) myList.get(0);
        String last = (String) myList.get(myList.size() - 1);
        System.out.printf("first = %s, last = %s%n", first, last);

        myList.set(3, "new");
        System.out.println(myList + "(new element in cell 3)");

        myList.add(0, "zero");
        System.out.println(myList + "(new element in cell 0)");

        String[] forAdding = {"another", "and another", "aaaaand another"};
        myList.addAll(List.of(forAdding));
        System.out.println(myList + "(new elements with addAll)");
        System.out.println("-".repeat(10) + "End processing ListB" + "-".repeat(10));
        System.out.println();
    }

    private static void processSetC() {
        System.out.println("-".repeat(10) + "Start processing SetC" + "-".repeat(10));

        SetC mySet =  new SetC();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        mySet.add("five");
        System.out.println(mySet);

        mySet.remove("three");
        System.out.println(mySet + "(after removing object \"three\")");

        boolean containsThree = mySet.contains("three");
        boolean containsOne = mySet.contains("one");
        int sizeOfSet = mySet.size();
        boolean isEmpty = mySet.isEmpty();
        System.out.printf("contains \"three\" = %b, contains \"one\" = %b%n", containsThree, containsOne);
        System.out.printf("size of set = %d, is set empty = %b%n", sizeOfSet, isEmpty);

        String[] forAdding = {"another", "and another", "aaaaand another"};
        mySet.addAll(List.of(forAdding));
        System.out.println(mySet + "(new elements with addAll)");

        String[] forContainsAll = {"one", "six", "zero"};
        boolean isContainsAll = mySet.containsAll(List.of(forContainsAll));
        System.out.println("Is mySet contains all elements in set " + Arrays.toString(forContainsAll) + " = " + isContainsAll);

        String[] forRemoveAll = {"one", "two"};
        boolean removeAll = mySet.removeAll(List.of(forRemoveAll));
        System.out.println(mySet + "(after removing all elements of " + Arrays.toString(forRemoveAll) + ")");

        System.out.println("-".repeat(10) + "End processing SetC" + "-".repeat(10));
        System.out.println();
    }
}
