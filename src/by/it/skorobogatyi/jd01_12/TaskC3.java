package by.it.skorobogatyi.jd01_12;

import java.util.*;

public class TaskC3 {


    public static final String FOR_REMOVAL = "[^\\(\\)\\{\\}\\[\\]]+";
    public static final String CHARS = "{[(";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        boolean isStringCorrect = process(string);

        System.out.println(isStringCorrect);


    }

    private static boolean process(String string) {

        string = string.replaceAll(FOR_REMOVAL, "");

        char[] elements = string.toCharArray();

        Deque<Character> charactersQueue = new ArrayDeque<>();

        for (char element : elements) {
            if (CHARS.indexOf(element) >= 0) {
                charactersQueue.addFirst(element);
            } else {
                if (charactersQueue.isEmpty()) {
                    return false;
                } else if (element == ']' && charactersQueue.peekFirst().equals('[')) {
                    charactersQueue.poll();
                } else if (element == ')' && charactersQueue.peekFirst().equals('(')) {
                    charactersQueue.poll();
                } else if (element == '}' && charactersQueue.peekFirst().equals('{')) {
                    charactersQueue.poll();
                } else {
                    return false;
                }
            }

        }
        return charactersQueue.isEmpty();
    }
}

