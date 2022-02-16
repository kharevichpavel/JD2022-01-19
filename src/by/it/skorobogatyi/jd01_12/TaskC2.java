package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskC2 {


    public static void main(String[] args) {


        Integer[] first = {1,2,3,4,4,4,5,5,5,6,6};
        Integer[] second = {1,2,3,4,4,4,5,5,5,6,6,7,8,9};
        Integer[] third = {4,4,5,5,9,9,8,7,6,5,4,6};

        List<Number> listLeft = Arrays.asList(first);
        List<Number> listRight = Arrays.asList(second);
        List<Number> Middle = Arrays.asList(third);

        HashSet<Number> leftSet = new HashSet<>(listLeft);
        HashSet<Number> rightSet = new HashSet<>(listRight);

        Set<String> union = getUnion(leftSet, rightSet);
        System.out.println(union);

        Set<String> cross = getCross(leftSet, rightSet);
        System.out.println(cross);
    }

    private static Set<String> getUnion(Set<Number> ... sets) {
        HashSet<Number> joinedSet = new HashSet<>();
        for (int i = 0; i < sets.length; i++) {
            Collection<Number> set = sets[i];
            joinedSet.addAll(set);
        }

        Object[] digitsArray = joinedSet.toArray();

        HashSet<String> stringsSet = new HashSet<>();
        for (int i = 0; i < joinedSet.size(); i++) {
            String elementForAdding = digitsArray[i].toString();

            if (elementForAdding.contains(".")) {
                String integerPart = elementForAdding.substring(0, elementForAdding.indexOf("."));
                String decimalPart = elementForAdding.substring(elementForAdding.indexOf("."));

                if (decimalPart.equals(".0")) {
                    stringsSet.add(integerPart);
                } else {
                    stringsSet.add(elementForAdding);
                }
            } else {
                stringsSet.add(elementForAdding);
            }
        }
        return stringsSet;
    }

    private static Set<String> getCross(Set<Number> ... sets) {

        HashSet<Number> joinedSet = new HashSet<>();
        for (int i = 0; i < sets.length; i++) {
            Collection<Number> set = sets[i];
            joinedSet.addAll(set);
        }

        Object[] digitsArray = joinedSet.toArray();

        HashSet<String> stringsSet = new HashSet<>();
        for (int i = 0; i < joinedSet.size(); i++) {
            String elementForAdding = digitsArray[i].toString();

            if (elementForAdding.contains(".")) {
                String integerPart = elementForAdding.substring(0, elementForAdding.indexOf("."));
                String decimalPart = elementForAdding.substring(elementForAdding.indexOf("."));

                if (decimalPart.equals(".0")) {
                    stringsSet.add(integerPart);
                } else {
                    stringsSet.add(elementForAdding);
                }
            } else {
                stringsSet.add(elementForAdding);
            }
        }
        return stringsSet;
    }
}
