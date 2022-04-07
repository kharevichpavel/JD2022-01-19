package by.it.kharevich.codewars;


import java.util.Arrays;

public class Task51 {
    public static int[] sortArray(int[] array) {
        int[] ints = Arrays.copyOf(array, array.length);
        Arrays.sort(ints);
        int j = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                while(j < array.length && array[j] % 2 == 0)
                    j++;
                array[j++] = ints[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(sortArray(new int[]{ 9, 3, 2, 8, 5, 4 }));

    }
}
