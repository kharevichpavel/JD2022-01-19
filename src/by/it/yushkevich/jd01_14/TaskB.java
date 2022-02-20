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

    public static void main(String[] args) throws IOException {

        String fileName = PathFinder.getFileName(TaskA.class, ROOT, POEM_TXT);
        List<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String text;
        int dotsCounter = 0;
        int wordCounter = 0;

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
        reader.close();

        System.out.printf("words=%d, punctuation marks=%d", wordCounter,dotsCounter);




        String fileName2 = PathFinder.getFileName(TaskA.class, ROOT, TXT);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {

            writer.write("words="+wordCounter+", punctuation marks="+dotsCounter);


        } catch (IOException e){
            throw new RuntimeException("OMG", e);
        }

    }
}
