package by.it.yushkevich.jd01_12;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {
        Integer[] left = {1,2,3,4,5,56,6,6,6,7,8};
        Integer[] right = {};

        List<Integer> listLeft = Arrays.asList(left);// asList деалем из массива список arraylist с методами
        List<Integer> listRight = Arrays.asList(4,4,5,5,6,9,9,8,7,5,4,6);

        Set<Integer> leftSet = new HashSet<>(listLeft);
        Set<Integer> rightSet = new TreeSet<>(listRight);
        System.out.printf("Left set = %s%n", leftSet);
        System.out.printf("Right set = %s%n", rightSet);

        Set<Integer> union = getUnion(leftSet,rightSet);
        System.out.printf("Union set = %s%n", union);

        Set<Integer> cross = getCross(leftSet,rightSet);
        System.out.printf("Cross set = %s%n", cross);
    }

    private static Set<Integer> getUnion(Set<Integer> leftSet, Set<Integer> rightSet) {

        HashSet<Integer> result = new HashSet<>(leftSet); // делаем третьью колекцию, чтоб над ней проводить изменения (чтоб не изменился исходный массив/коллекция)
                                                          // что-то вроде как мы делали массив клон. и
        result.addAll(rightSet);

        return result;

    }

    private static Set<Integer> getCross(Set<Integer> leftSet, Set<Integer> rightSet) {
        HashSet<Integer> result = new HashSet<>(leftSet);
        // метод retainAll удаляет во второй коллекции элементы, которых нет в первой коллекции, т.е. находит только одинаковые.
        result.retainAll(rightSet);
        return result;
    }
}
