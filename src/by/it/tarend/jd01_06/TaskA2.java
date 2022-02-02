package by.it.tarend.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {

    private static String[] words = {}; // лучше создать внутри main
    private static int[] counts = {}; // // лучше создать внутри main

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) { // перебираем все слова из текста
            String word = matcher.group(); // нашли слово и поместили его в word
            processOneWord(word); // или добавили слово и счетчик = 1 или увеличили счетчик на 1 если такое слово уже занесенов  массив )
        }
        printResult();
    }

    private static void processOneWord(String word) {
        for (int i = 0; i < words.length; i++) { // перебираем все слова в массиве вордс
            if (words[i].equals(word)) { // если находим слово = ворд то увеличиваем счетчик этого слова
                counts[i]++;
                return;
            }
        }
        words = Arrays.copyOf(words, words.length + 1); // увеличиваем размер массива со словами на 1 тк не нашли совпадений с word
        counts = Arrays.copyOf(counts, counts.length + 1); // // увеличиваем размер массива со счетчиками на 1 тк не нашли совпадений с word
        words[words.length - 1] = word; // записываем word на последнее место в массиве
        counts[counts.length - 1] = 1;

    }

    private static void printResult() {
        for (int i = 0; i < words.length; i++) {
            System.out.printf("%s=%d%n", words[i], counts[i]);
        }
    }
}
