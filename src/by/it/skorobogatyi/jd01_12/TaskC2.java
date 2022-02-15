package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskC2 {

    public static void main(String[] args) {

        Integer[] first = {1,2,3,4,4,4,5,5,5,6,6};
        Integer[] second = {1,2,3,4,4,4,5,5,5,6,6};
        Integer[] third = {4,4,5,5,9,9,8,7,6,5,4,6};

        List<Integer> listLeft = Arrays.asList(first);
        List<Integer> listRight = Arrays.asList(second);
        List<Integer> Middle = Arrays.asList(third);

        HashSet<Integer> leftSet = new HashSet<>(listLeft);
        TreeSet<Integer> rightSet = new TreeSet<>(listRight);

        Set<Integer> union = getUnion(leftSet, rightSet);
        System.out.println(union);

        Set<Integer> cross = getCross(leftSet, rightSet);
        System.out.println(cross);
    }

    private static Set<Integer> getUnion(Set<?> ... sets) {


        return null;
    }

    private static Set<Integer> getCross(Set<?> ... sets) {

        return null;
    }
}
