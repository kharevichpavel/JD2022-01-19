package by.it.burov.jd01_12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskA2 {
    public static void main(String[] args) {
        Integer[] left = {1,2,3,4,5,6,7,8,10};
        Integer[] right = {6,3,4,5,6,4,8,10};
        List<Integer> listLeft = Arrays.asList(left);
        List<Integer> listRight = Arrays.asList(right);
        HashSet<Integer> setLeft = new HashSet<>(listLeft);
        HashSet<Integer> setRight = new HashSet<>(listRight);
        System.out.println("Left set " + setLeft);
        System.out.println("Right set " + setRight);
        Set<Integer> union=getUnion(setLeft,setRight);
        System.out.println("union set " + union);
        System.out.println("union left set " + setLeft);
        System.out.println("union right set " + setRight);
        Set<Integer> cross=getCross(setLeft,setRight);
        System.out.println("cross " + cross);
        System.out.println("cross left set " + setLeft);
        System.out.println("cross right set " + setRight);

    }

    private static Set<Integer> getUnion(Set<Integer> setLeft, Set<Integer> setRight) {
        HashSet<Integer> hashSet = new HashSet<>(setLeft);
        hashSet.addAll(setRight);
        return hashSet;
    }

    private static Set<Integer> getCross(Set<Integer> setLeft, Set<Integer> setRight) {
        HashSet<Integer> hashSet = new HashSet<>(setLeft);
        hashSet.retainAll(setRight);
        return hashSet;
    }
}
