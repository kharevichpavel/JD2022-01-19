package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskA2 {

    public static void main(String[] args) {

        Integer[] left = {1,2,3,4,4,4,5,5,5,6,6};
        Integer[] right = {4,4,5,5,9,9,8,7,6,5,4,6};

        List<Integer> listLeft = Arrays.asList(left);
        List<Integer> listRight = Arrays.asList(right);

        HashSet<Integer> leftSet = new HashSet<>(listLeft);
        TreeSet<Integer> rightSet = new TreeSet<>(listRight);

        Set<Integer> union = getUnion(leftSet, rightSet);
        System.out.println(union);

        Set<Integer> cross = getCross(leftSet, rightSet);
        System.out.println(cross);

    }

    private static Set<Integer> getUnion(Set<Integer> setLeft, Set<Integer> setRight) {
        HashSet<Integer> result = new HashSet<>(setLeft);
        result.addAll(setRight);
        return result;
    }

    private static Set<Integer> getCross(Set<Integer> setLeft, Set<Integer> setRight) {
        HashSet<Integer> result = new HashSet<>(setLeft);
        result.retainAll(setRight);
        return result;
    }


}
