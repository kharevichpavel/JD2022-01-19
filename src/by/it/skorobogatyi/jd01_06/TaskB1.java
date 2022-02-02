package by.it.skorobogatyi.jd01_06;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    private static String[] words = {};
    private static final char[] vowels = {'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    private static final char[] consonants = {'й', 'ц', 'к', 'н', 'г', 'ш', 'щ', 'з', 'х', 'ф', 'в', 'п', 'р', 'л', 'д', 'ж', 'б', 'т', 'м', 'с', 'ч'};


    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(Poem.text);

        Pattern pattern = Pattern.compile("[А-Яа-яЁё]+");
        Matcher matcher = pattern.matcher(stringBuilder);

        int counter = 0;
        while (matcher.find()) {

            String word = matcher.group();

            if (isValid(word)) {

                words = Arrays.copyOf(words, words.length + 1);

                words[counter] = word;
                counter++;
            }
        }

        for (String string : words) {
            System.out.println(string);
        }
    }

    private static boolean isValid(String word) {

        if (word.length() < 2) {
            return false;
        }

        char firstLetter = word.toLowerCase(Locale.ROOT).charAt(0);
        char lastLetter = word.toLowerCase(Locale.ROOT).charAt(word.length() - 1);

        int score = 0;

        for (char consonant : consonants) {
            if (consonant == firstLetter) {
                score++;
                break;
            }
        }

        for (char vowel : vowels) {
            if (vowel == lastLetter) {
                score++;
                break;
            }
        }

        return score == 2;
    }
}
