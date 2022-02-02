package by.it.tarend.jd01_06;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            if (checkLetterRule(word)) {
                System.out.println(word);
            }
        }
    }

    private static boolean checkLetterRule(String word) {

        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        consonants = consonants + consonants.toLowerCase(Locale.ROOT);
        String vowels = "АИОУЫЭЕЁЮЯ";
        vowels = vowels.toLowerCase(Locale.ROOT);
        return ((consonants.indexOf(firstLetter) >= 0) && (vowels.indexOf(lastLetter) >= 0));
    }
}
