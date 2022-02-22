package by.it.kharevich.jd01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {

        Integer[] left = {1, 4, 6, 3, 6, 6, 6, 6, 6, 0, -1, 4, -5, 5, 2};
        Integer[] right = {4, 8, 4, 3, -2, 6, 6, 10, 8, 9, 1, 2, 3, 5, 7, -1};
        List<Integer> leftList = Arrays.asList(left);
        List<Integer> rightList = Arrays.asList(right);

        System.out.println("-------------------------------------------------------");
        Set<Integer> leftSet = new HashSet<>(leftList);
        Set<Integer> rightSet = new TreeSet<>(rightList);
        System.out.printf("leftSet = %s%n", leftSet);
        System.out.printf("rightSet = %s%n", rightSet);
        System.out.println("-------------------------------------------------------");

        Set<Integer> union = getUnion(leftSet, rightSet);
        System.out.printf("union = %s%n", union);
        System.out.printf("leftSet = %s%n", leftSet);
        System.out.printf("rightSet = %s%n", rightSet);
        System.out.println("-------------------------------------------------------");

        Set<Integer> cross = getCross(leftSet, rightSet);
        System.out.printf("cross = %s%n", cross);
        System.out.printf("leftSet = %s%n", leftSet);
        System.out.printf("rightSet = %s%n", rightSet);
        System.out.println("-------------------------------------------------------");
    }

    private static Set<Integer> getUnion(Set<Integer> leftSet, Set<Integer> rightSet) {
        Set<Integer> union = new HashSet<>(leftSet);
        union.addAll(rightSet);
        return union;
    }

    private static Set<Integer> getCross(Set<Integer> leftSet, Set<Integer> rightSet) {
        Set<Integer> union = new HashSet<>(leftSet);
        union.retainAll(rightSet);
        return union;
    }
}
