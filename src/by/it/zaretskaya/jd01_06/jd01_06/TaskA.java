package by.it.zaretskaya.jd01_06.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {
    public static void main(String[] args) {
        StringBuilder dynamicTest = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{4,}");
        Matcher matcher = pattern.matcher(dynamicTest);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int size=end-start;
            dynamicTest.setCharAt(start+3,'#');
            if (size>=7){
                dynamicTest.setCharAt(start+6,'#');
            }
        }
        System.out.println(dynamicTest);
    }
}
