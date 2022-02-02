package by.it.tarend.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {

    private static String[] sentences = {};

    public static void main(String[] args) {
        String regex = "[а-яА-ЯёЁ:,\\s-]+(\\.\\.\\.)?[а-яА-ЯёЁ:,\\s-]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String sentence = matcher.group();
            processSentence(sentence);
        }
        sortSentences(sentences);
        System.out.println();
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }

    }

    private static void processSentence(String sentence) {

        String regex = "[^а-яА-яёЁ]+";
        Pattern.compile(regex);
        sentence = sentence.replaceAll(regex, " ");
        sentence = sentence.trim();

        sentences = Arrays.copyOf(sentences, sentences.length+1);
        sentences[sentences.length - 1] = sentence;

    }

    private static void sortSentences(String[] sentences) {

        for (int i = 0; i < sentences.length; i++) {
            int minLengthIndex = i;
            for (int j = i; j < sentences.length; j++) {
                if (sentences[minLengthIndex].length() > sentences[j].length()) {
                    minLengthIndex = j;
                }
            }
            String buffer = sentences[i];
            sentences[i] = sentences[minLengthIndex];
            sentences[minLengthIndex] = buffer;
        }
    }
}
