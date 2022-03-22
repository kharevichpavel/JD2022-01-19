package by.it.kharevich.codewars;


import java.util.Arrays;

public class Task27 {

    public static String highAndLow(String numbers) {
        String[] line = numbers.trim().split(" ");
        int[] lineInt = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            lineInt[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(lineInt);
        String result = ((lineInt[lineInt.length-1]) + " " + (lineInt[0]));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("4 2 3 7 5 9"));

    }
}
