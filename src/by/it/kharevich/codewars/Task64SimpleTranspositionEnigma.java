package by.it.kharevich.codewars;

import java.util.ArrayList;
import java.util.List;

public class Task64SimpleTranspositionEnigma {
    public static String simpleTransposition(String text) {
        List<String> row1 = new ArrayList<>();
        List<String> row2 = new ArrayList<>();
        String res1 = "";
        String res2 = "";
        for (int i = 0; i < text.length(); i++)
            if (i % 2 == 0) {
                row1.add(String.valueOf(text.charAt(i)));
            } else {
                row2.add(String.valueOf(text.charAt(i)));
            }
        for (String s : row1) res1 += s;
        for (String s : row2) res2 += s;
        return res1 + res2;
    }

    public static void main(String[] args) {
        System.out.println(simpleTransposition("Sample text"));

    }
}

/*
public static String simpleTransposition(String text) {
    String right = "";
    String left = "";
        for (int i=0; i<text.length(); i++) {
            if (i%2 == 0) left+=text.charAt(i);
            else right+=text.charAt(i);
        }
        return left+right;
    }
 */