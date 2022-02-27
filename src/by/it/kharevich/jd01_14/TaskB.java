package by.it.kharevich.jd01_14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {

    public static final String ROOT = "src";
    public static final String POEM = "Poem.txt";
    public static final String TXT = "resultTaskB.txt";
    public static final String LETTERS = "[а-яА-ЯёЁ]+";
    public static final String MARKS = "[!.,;:?\\-]+";

    public static void main(String[] args) {
        String result = PathFinder.getFilename(TaskB.class, ROOT, TXT);
        String poemTxt = PathFinder.getFilename(TaskB.class, ROOT, POEM);
        File poem = new File(poemTxt);
        int words = 0;
        int punctuationMarks = 0;
        counterWordsMarks(poem, words, punctuationMarks);
        printTxtFile(words, punctuationMarks, result, poem);
    }

    static void counterWordsMarks(File poem, int words, int punctuationMarks) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(poem)))) {
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                Pattern patternWords = Pattern.compile(LETTERS);
                Matcher matcherWords = patternWords.matcher(text);
                while (matcherWords.find()) {
                    words++;
                }
                Pattern patternMarks = Pattern.compile(MARKS);
                Matcher matcherMarks = patternMarks.matcher(text);
                while (matcherMarks.find()) {
                    punctuationMarks++;
                }
            }
            System.out.printf("words=%d" + ", punctuation marks=%d%n", words, punctuationMarks);
        } catch (IOException e) {
            throw new RuntimeException("IO ERROR", e);
        }
    }

    private static void printTxtFile(int words, int punctuationMarks, String result, File poem) {
        try (PrintWriter printWriter = new PrintWriter(result)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(poem)));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                Pattern patternWords = Pattern.compile(LETTERS);
                Matcher matcherWords = patternWords.matcher(text);
                while (matcherWords.find()) {
                    words++;
                }
                Pattern patternMarks = Pattern.compile(MARKS);
                Matcher matcherMarks = patternMarks.matcher(text);
                while (matcherMarks.find()) {
                    punctuationMarks++;
                }
            }
            printWriter.printf("words=%d" + ", punctuation marks=%d%n", words, punctuationMarks);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO ERROR", e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

