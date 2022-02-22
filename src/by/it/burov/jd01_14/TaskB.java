package by.it.burov.jd01_14;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {


    static int quantityWords = 0;
    static int quantityPunctuationMarks =0;

    private static final String FILENAME = "Poem.txt";
    private static final String ROOT = "src";
    private static final String TXT = "resultTaskB.txt";
    private static final String NOTWORDS = "[^а-яА-ЯёЁ]+";
    private static final String PunctuationMarks = "\\p{Punct}+";

    public static void main(String[] args) {
        String inFile = PathFinder.getFilename(TaskB.class,ROOT,FILENAME);
        readFile(inFile);
        System.out.printf("words=%d,punctuation marks=%d",quantityWords,quantityPunctuationMarks);
        String outFile = PathFinder.getFilename(TaskB.class,ROOT,TXT);
        outToTxt(outFile);
    }

    private static void readFile(String inFile) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(inFile))){
            String line;
            Pattern pattern = Pattern.compile(PunctuationMarks);
            Matcher matcher;
            while (reader.ready()){
                line = reader.readLine();
                String[] words = line.split(NOTWORDS);
                String[] wordsWithPunct = line.split("\\s");
                quantityWords += words.length;
                for (String word : wordsWithPunct){
                    matcher = pattern.matcher(word);
                    while (matcher.find()){
                        quantityPunctuationMarks++;
                    }
                }
            }

        } catch (IOException  e) {
            e.printStackTrace();
        }
    }

    private static void outToTxt(String outFile) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))){
            writer.write(String.format("words=%d,punctuation marks=%d",quantityWords,quantityPunctuationMarks));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
