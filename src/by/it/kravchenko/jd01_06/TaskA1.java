package by.it.kravchenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder newText = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(newText);
        while (matcher.find()) {
            int start = matcher.start();
            int last = matcher.end();
            int size = last - start;
            newText.setCharAt(start + 3, '#');
            if (size >= 7) {
                newText.setCharAt(start + 6, '#');
            }
        }

        System.out.println(newText);

    }
}
