package by.it.tarend.jd01_06;

import java.util.Random;

public class TaskC2 {

    public static void main(String[] args) {
        String text = Poem.text;
        long slow1 = System.nanoTime();
        String slow = slow(text);
        long slow2 = System.nanoTime();
        long slowTime = slow2 - slow1;
        System.out.println(slow + "\n" + slowTime + "\n\n");

        long fast1 = System.nanoTime();
        String fast = fast(text);
        long fast2 = System.nanoTime();
        long fastTime = fast2 - fast1;
        System.out.println(fast + "\n" + fastTime + "\n");

    }

    private static String fast(String text) {
        String[] wordsArray = text.split("[^а-яА-яёЁ]+");
        StringBuilder randomText = new StringBuilder("");
        Random random = new Random(1);
        while (randomText.length() <= 100000) {
            randomText = randomText.append(" ").append(wordsArray[random.nextInt(wordsArray.length)]);
        }
        return randomText.toString();
    }

    private static String slow(String text) {
        String[] wordsArray = text.split("[^а-яА-яёЁ]+");
        String randomText = "";
        Random random = new Random(1);
        while (randomText.length() <= 100000) {
            randomText = randomText + " " + wordsArray[random.nextInt(wordsArray.length)];
        }
        return randomText;
    }
}
