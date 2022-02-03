package by.it.skorobogatyi.jd01_06;

import java.util.Random;

import static java.lang.System.currentTimeMillis;

public class TaskC2 {

    static long seed = 134;
    static int iterationsNumber = 40000;
    static int randomLowerBorder = 10;
    static int randomUpperBorder = 100;



    public static void main(String[] args) {


        String textFromSlow = "";
        String textFromFast = "";

        long timeSlowSystem = currentTimeMillis();
        textFromSlow = slow(textFromSlow);
        timeSlowSystem = currentTimeMillis() - timeSlowSystem;

        long timeFastSystem = currentTimeMillis();
        textFromFast = fast(textFromFast);
        timeFastSystem = currentTimeMillis() - timeFastSystem;

        System.out.println("Slow time = " + timeSlowSystem);
        System.out.println("Fast time = " + timeFastSystem);

        System.out.println(textFromSlow);
        System.out.println(textFromFast);
    }


    static String slow(String text) {

        Random random = new Random(seed);
        String returnText = text;

        for (int i = 0; i < iterationsNumber; i++) {
            int number = random.nextInt(randomLowerBorder, randomUpperBorder);
            returnText = returnText.concat(number + " ");
        }

        return returnText;
    }


    static String fast(String text) {

        Random random = new Random(seed);
        StringBuilder returnText = new StringBuilder(text);

        for (int i = 0; i < iterationsNumber; i++) {
            int number = random.nextInt(randomLowerBorder, randomUpperBorder);
            returnText.append(number).append(" ");
        }

        return String.valueOf(returnText);
    }
}
