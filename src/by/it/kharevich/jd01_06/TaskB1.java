package by.it.kharevich.jd01_06;



import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(by.it.kharevich.jd01_06.Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            processOneWord(word);
        }


    }

    private static String[] words = {};
    private static String[] symbol = {"а, у, о, ы, и, э, я, ю, ё, е, А, У, О, И, Э, Я , Ю, Ё, Е"};


    private static boolean processOneWord(String word) {
        char firstLetter = word.charAt(0);


        char lastLetter = word.charAt(word.length()-1);


        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < symbol.length; j++) {
                if (symbol.equals(firstLetter)) {

                }




            }
        }


        return false;
    }



}
