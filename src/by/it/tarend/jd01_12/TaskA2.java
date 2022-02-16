package by.it.tarend.jd01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Integer[] left = {1, 2, 5, 34, 8, 8, 8, 3, 4, 5, 6, 7};
        Integer[] right = {7, 67, 45, 34, 5, 8, 7, 6};

        List<Integer> listLeft = Arrays.asList(left);
        List<Integer> listRight = Arrays.asList(right);  // можно просто накидать чисел вместо ссылки на массив

        Set<Integer> leftSet = new HashSet<>(listLeft);
        Set<Integer> rightSet = new TreeSet<>(listRight);
        System.out.printf("Left set = %s%nRight set = %s%n", leftSet, rightSet);

        Set<Integer> union = getUnion(leftSet, rightSet);
        System.out.printf("Union set = %s%n", union);
        
        Set<Integer> cross = getCross(leftSet, rightSet);
        System.out.printf("Cross set = %s%n", cross);
    }

    private static Set<Integer> getCross(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> newSet = new HashSet<>(leftSet);
        newSet.retainAll(rightSet);
        return newSet;
    }

    private static Set<Integer> getUnion(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> newSet = new HashSet<>(leftSet);
        newSet.addAll(rightSet);
        return newSet;
    }
}
