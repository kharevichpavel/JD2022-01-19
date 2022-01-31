package by.it.skorobogatyi.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(Poem.text);

        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int wordLength = end - start;

            stringBuilder.setCharAt(start + 3, '#');

            if (wordLength >= 7) {
                stringBuilder.setCharAt(start + 6, '#');
            }
        }
        System.out.println(stringBuilder);
    }
}
