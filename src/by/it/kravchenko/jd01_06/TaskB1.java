package by.it.kravchenko.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            if (checkLeters(word)){
                System.out.println(word);
            }
        }

    }

    private static boolean checkLeters(String word) {
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        String vowels = "ЁУЕЫАОЭЯИЮёуеыаоэяиюё";
        String cosonants ="ЙЦКНГШЩЗХФВПРЛДЖЧСМТБЬйцкнгшщзхфвпрлджчсмтбь";
        return ((vowels.indexOf(lastLetter)>0)&&(cosonants.indexOf(firstLetter)>0));


    }
}

