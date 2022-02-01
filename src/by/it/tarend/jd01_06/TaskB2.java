package by.it.tarend.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {

    public static void main(String[] args) {
        String regex = "[а-яА-ЯёЁ:,\\s-]+(\\.\\.\\.)?[а-яА-ЯёЁ:,\\s-]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String sentence = matcher.group();
            sentence = processSentence(sentence);

            System.out.println(sentence);
        }


    }

    private static String processSentence(String sentence) {

        String regex = "[^а-яА-яёЁ]+";
        Pattern pattern = Pattern.compile(regex);
        sentence = sentence.replaceAll(regex, " ");

        return sentence.trim();
    }
}
