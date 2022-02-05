package by.it.zaretskaya.jd01_06.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    private static String[] words = {};
    private static int[] counts = {};

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            processOneWord(word);
        }
        printResult();
    }

    private static boolean processOneWord(String word) {
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(words.length-1);
        String.valueOf("б, в, г, д, ж, з, й, к, л, м, н, п, р, с, т, ф, х, ц, ч, ш, щ");
        String.valueOf("а, у, о, ы, и, э, я, ю, ё, е");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                counts[i]++;

            }
        }
        words = Arrays.copyOf(words, words.length + 1);
        counts = Arrays.copyOf(counts, counts.length + 1);
        words[words.length - 1] = word;
        counts[counts.length - 1] = 1;
        return false;
    }

    private static void printResult() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s=%d%n", words[i], counts[i]);
        }
    }
}



