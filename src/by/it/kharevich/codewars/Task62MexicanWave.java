package by.it.kharevich.codewars;

import java.util.ArrayList;
import java.util.List;

public class Task62MexicanWave {
    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i+1));
            }
        }
        System.out.println(result);

        return result.toArray(new String[0]);
    }


    public static void main(String[] args) {
        System.out.println(wave("this is a few words"));
    }
}


/*
public class Task62MexicanWave {
    public static String[] wave(String str) {
        String[] words = str.trim().split("");
        String word;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Pattern pattern = Pattern.compile(words[i], Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                word = str.replace(words[i], words[i].toUpperCase());
                res.add(word);
            }
        }
        System.out.println(res);
        String[] wordsArray = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            wordsArray[i] = res.get(i);
            System.out.println(wordsArray[i]);
        }
        return wordsArray;
    }

 */