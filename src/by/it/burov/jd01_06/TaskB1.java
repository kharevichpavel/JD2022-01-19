package by.it.burov.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    private static String[] words={};

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(builder);
        while (matcher.find()){
            String word = matcher.group();
            checkWord(word);
        }
        printResult();
    }


    private static void checkWord(String word) {
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        String vowelsRussian = "аоуэиыеёяю";
        String consonantsRussian = "йцкнгшщзхфвпрлджбтмсч";
        if ((consonantsRussian.indexOf(Character.toLowerCase(firstLetter)) != -1) && (vowelsRussian.indexOf(Character.toLowerCase(lastLetter)) != -1)){
            words= Arrays.copyOf(words,words.length+1);
            words[words.length - 1] = word;
        }
    }

    private static void printResult() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s%n",words[i]);
        }
    }
}

