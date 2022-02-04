package by.it.burov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC1 {

    private static String[] array = {};

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("\n");
        String[] array = pattern.split(builder);
        compareLines(array);
        printResult(array);

    }

    private static void compareLines(String[] array) {
        int max = Integer.MIN_VALUE;
        for (String s : array) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == max) {
                continue;
            }
            int spaceInLine = array[i].indexOf(" ");
            int counter = 1;
            while (array[i].length() != max) {
                array[i] = array[i].substring(0, spaceInLine) + " " + array[i].substring(spaceInLine);
                spaceInLine = array[i].indexOf(" ", spaceInLine + counter + 1);
                if (spaceInLine == -1) {
                    spaceInLine = array[i].indexOf(" ");
                    counter++;
                }
            }
        }
    }

    private static void printResult(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s%n", array[i]);
        }
    }
}
