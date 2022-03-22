package by.it.kharevich.codewars;

/*
Учитывая двумерный массив целых чисел, вернуть сглаженную версию массива со всеми целыми числами в отсортированном (по возрастанию) порядке.

Пример:

Учитывая [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], ваша функция должна возвращать [1, 2, 3, 4, 5, 6, 7, 8 , 9].
 */

import java.util.Arrays;

public class Task29 {

    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(flattenAndSort(new int[][] {{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}}));

    }
}
