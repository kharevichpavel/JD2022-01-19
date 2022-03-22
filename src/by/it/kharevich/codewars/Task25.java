package by.it.kharevich.codewars;

import java.util.Arrays;
import java.util.Collections;

public class Task25 {

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(0112));

    }
}

