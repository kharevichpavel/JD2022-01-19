package by.it.burov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]{4,}");
        final Matcher matcher = pattern.matcher(builder);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int size = end - start;
            builder.setCharAt(start+3,'#');
            if(size >= 7){
                builder.setCharAt(start+6,'#');
            }
        }
        System.out.println(builder);
    }
}
