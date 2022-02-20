package by.it.yushkevich.jd01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {

    public static final String POEM_TXT = "Poem.txt";
    public static final String ROOT = "src";
    public static final String WORDS_REGEX = "[а-яА-ЯЁё]+";
    public static final String DOTS_REGEX = "[,.!?:;-]+";
    public static final String TXT = "resultTaskB.txt";
    private static int dotsCounter = 0;
    private static int wordCounter = 0;

    public static void main(String[] args) {


        String fileName = PathFinder.getFileName(TaskA.class, ROOT, POEM_TXT);
        countWordsAndDots(fileName);

        String writeTxtName = PathFinder.getFileName(TaskA.class, ROOT, TXT);
        writeToTxt(dotsCounter, wordCounter, writeTxtName);

    }

    private static void countWordsAndDots(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String text;

            while ((text = reader.readLine()) != null) {

                Pattern patternWord = Pattern.compile(WORDS_REGEX);
                Matcher matcherWord = patternWord.matcher(text);

                Pattern patternDots = Pattern.compile(DOTS_REGEX);
                Matcher matcherDots = patternDots.matcher(text);

                while (matcherDots.find()) {
                    dotsCounter++;
                }
                while (matcherWord.find()) {
                    wordCounter++;
                }
            }

            System.out.printf("words=%d, punctuation marks=%d", wordCounter, dotsCounter);

        } catch (IOException e) {
            throw new RuntimeException("Что-то пошло не так в попытке чтения файла", e);
        }
    }



    private static void writeToTxt(int dotsCounter, int wordCounter, String writeTxtName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writeTxtName))) {

            writer.write("words=" + wordCounter + ", punctuation marks=" + dotsCounter);


        } catch (IOException e) {
            throw new RuntimeException("OMG", e);
        }
    }
}
