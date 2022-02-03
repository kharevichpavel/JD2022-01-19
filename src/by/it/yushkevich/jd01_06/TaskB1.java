package by.it.yushkevich.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {


    private static char[] vowels = {'а', 'у', 'е', 'ы', 'о', 'э', 'я', 'и', 'ю', 'ё', 'ы'};
    private static char[] consonants = {'й', 'ц', 'к', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ф', 'в', 'п', 'р', 'л', 'д', 'ж', 'б', 'т', 'м', 'с', 'ч'};


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        StringBuilder stringBuilder = new StringBuilder(Poem.text);
        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {

            String word = matcher.group();
            if (isCorrect(word)){
                System.out.println(word);
            }


        }

    }

    private static boolean isCorrect(String word) {
        if (word.length() >= 2) {

            String lowWord = word.toLowerCase();

            char start = lowWord.charAt(0);
            char end = lowWord.charAt(lowWord.length() - 1);
            //проверяем на соответствеие с согласными первую букву , если подходит, то тогда проверяем последнюю букву и печатаем.
            for (char consonant : consonants) {
                if (start == consonant) {
                    for (char vowel : vowels) {
                        if (end == vowel) {
                            //можно проверить принтф что выводится
                            //System.out.printf("WORD - %s  ||| char start --- %c    char end ---%c%n", word, start, end);
                            return true;
                        }
                    }

                }

            }

        }

        return false;

    }

}
