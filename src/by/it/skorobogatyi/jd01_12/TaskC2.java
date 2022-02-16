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

        Set<? extends Number> union = getUnion(leftSet, rightSet);
        System.out.println(union);

        Set<? extends Number> cross = getCross(leftSet, rightSet);
        System.out.println(cross);
    }

    private static Set<? extends Number> getUnion(Set<? extends Number> ... sets) {
        HashSet<? extends Number> returnSet = new HashSet<>();
        for (int i = 0; i < sets.length; i++) {
            Set<? extends Number> set = sets[i];
            Iterator<? extends Number> iterator = set.iterator();
            while (iterator.hasNext()) {
//                returnSet.add(iterator.next());
            }

        }
        return null;
    }

    private static Set<? extends Number> getCross(Set<? extends Number> ... sets) {

        return null;
    }
}
