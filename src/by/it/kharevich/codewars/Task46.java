package by.it.kharevich.codewars;

import java.util.Arrays;

public class Task46 {

    public static String oddOrEven (int[] array) {
        int count = 0;
        String result = "";
        for (int i = 0; i < array.length; i++) {
            count += array[i];
            if (count%2==0){
                result = "even";
            }else {
                result = "odd";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));

    }
}

//return (IntStream.of(array).sum() & 1) == 1 ? "odd" : "even";
