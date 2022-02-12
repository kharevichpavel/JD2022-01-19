package by.it.yushkevich.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {

    private static String[] array = {};

    public static void main(String[] args) {

        String ourText = correctionMultyDot(Poem.text);
        processText(ourText);
        sortText(array);

        for (String s : array) {
            System.out.println(s);
        }


    }

    //если есть троеточие и потом маленькая буква, то удаляем троеточие
    private static String correctionMultyDot(String text) {
        Pattern patternChecker = Pattern.compile("[\\.]{3}\s?[а-я]");
        Matcher matcherChecker = patternChecker.matcher(text);
        if (matcherChecker.find()) {

            text = text.replace("...", "");

        }
        return text;

    }



    private static void processText(String text) {

        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ\s\n:;,-]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String separate = matcher.group();
            separate = separate.replaceAll("[^а-яА-яёЁ]+", " ");
            separate = separate.trim();

            //увеличиваем масиив на 1, чтоб впихнуть туда предложение
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = separate; //впихнули на последнее место предложение

        }


    }

    private static void sortText(String[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    //меняем элементы местами
                    String buff = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buff;

                }


            }


        }


    }


}
