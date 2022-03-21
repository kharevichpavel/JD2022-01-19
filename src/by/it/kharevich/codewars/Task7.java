package by.it.kharevich.codewars;

import java.util.Arrays;

public class Task7 {

    public static int sum(int[] numbers){
        if(numbers == null || numbers.length <= 2) return 0;
        int count = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length-1; i++) {
            count = count + numbers[i];
        }
        return count;
    }
}
