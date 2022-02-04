package by.it.kuzma.jd01_06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder dinamicText = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(dinamicText);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            int size = end - start;
            dinamicText.setCharAt(start+3, '#');
            if (size >= 7) {
                dinamicText.setCharAt(start+6, '#');

            }
        }
        System.out.println(dinamicText);
    }
}
