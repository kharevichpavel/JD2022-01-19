package by.it.kharevich.jd01_06;

import by.it.kharevich.jd01_06.Poem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder forText = new StringBuilder(by.it.kharevich.jd01_06.Poem.text);
        Pattern example = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher exampleMatcher = example.matcher(forText);
        while (exampleMatcher.find()) {
            int start = exampleMatcher.start();
            int end = exampleMatcher.end();
            int size = end - start;
            forText.setCharAt(start + 3, '#');
            if (size >= 7) {
                forText.setCharAt(start + 6, '#');
            }
        }
        System.out.println(forText);
    }
}
