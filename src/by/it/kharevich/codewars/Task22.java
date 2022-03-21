package by.it.kharevich.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {

    public static int getCount(String str) {
        int vowelsCount = 0;
        StringBuilder stringBuilder = new StringBuilder(str);
        Pattern pattern = Pattern.compile("[a,e,i,o,u]");
        Matcher matcher = pattern.matcher(stringBuilder);
        while (matcher.find()){
            vowelsCount++;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));

    }
}
