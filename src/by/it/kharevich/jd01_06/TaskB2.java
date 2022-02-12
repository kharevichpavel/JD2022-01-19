package by.it.kharevich.jd01_06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {

    private static String[] words = {};

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher matcher = pattern.matcher(by.it.kharevich.jd01_06.Poem.text);
        while (matcher.find()) {
            String word = matcher.group();


        }
    }


}


