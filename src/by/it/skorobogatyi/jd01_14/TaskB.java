package by.it.skorobogatyi.jd01_14;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskB {

    private static final String ROOT = "src";
    private static final String OUTPUT_FILE = "resultTaskB.txt";
    private static final String INPUT_FILE = "Poem.txt";
    private static final String PUNCTUATION = "[\\p{P}]+";
    private static final String WORDS = "[А-Яа-яЁё]+";


    public static void main(String[] args) {

        Pattern punctuationPattern = Pattern.compile(PUNCTUATION);
        Pattern wordsPattern = Pattern.compile(WORDS);

        String inputTXTFileName = FilenameGetter.getFilename(TaskB.class, ROOT, INPUT_FILE);

        StringBuilder stringBuilder = readFromTXT(inputTXTFileName);

        int punctuationSignsNumber = findEntriesNumber(stringBuilder, punctuationPattern);
        int wordsNumber = findEntriesNumber(stringBuilder, wordsPattern);

        System.out.printf("words=%d%n" +
                "marks=%d", wordsNumber, punctuationSignsNumber);

        outputToTXTFile(punctuationSignsNumber, wordsNumber);

    }


    private static StringBuilder readFromTXT(String txtFileName) {

        int word = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try (
                FileReader fileReader = new FileReader(txtFileName)
        ) {
            while ((word = fileReader.read()) != -1) {
                stringBuilder.append((char) word);
            }
        } catch (IOException e) {
            throw new RuntimeException("ERROR: " + e);
        }
        return stringBuilder;
    }

    private static int findEntriesNumber(StringBuilder stringBuilder, Pattern pattern) {

        Matcher matcher = pattern.matcher(stringBuilder);
        int returnValue = 0;
        while (matcher.find()) {
            matcher.group();
            returnValue++;
        }
        return returnValue;
    }

    private static void outputToTXTFile(int punctuationSignsNumber, int wordsNumber) {

        String outputTXTFilename = FilenameGetter.getFilename(TaskB.class, ROOT, OUTPUT_FILE);
        try (
                PrintWriter printWriter = new PrintWriter(outputTXTFilename)
        ) {
            printWriter.printf("words=%d%n" +
                    "marks=%d", wordsNumber, punctuationSignsNumber);

        } catch (IOException e) {
            throw  new RuntimeException("ERROR: ", e);
        }
    }
}
