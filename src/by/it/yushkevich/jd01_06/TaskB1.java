package by.it.yushkevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    //private static char[] vowels = {'а', 'у', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю', 'ё', 'ы'};


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[^а-яА-ЯёЁ]+");
        StringBuilder stringBuilder = new StringBuilder(Poem.text);
        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {

            String word = matcher.group();
            isCorrect(word);


            //  String[] text = Poem.text.split("[^а-яА-ЯёЁ]+");


        }

    }

    private static boolean isCorrect(String word) {
        char start = word.charAt(0);
        char end = word.charAt(word.length() - 1);




        return false;

    }

}
