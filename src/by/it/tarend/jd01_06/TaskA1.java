package by.it.tarend.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder dynamicText = new StringBuilder(Poem.text); // создаем стрингбилдер и помещаем наш текст в него
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}"); // создаем регулрку которая ищет слова 4+ символа
        Matcher matcher = pattern.matcher(dynamicText); // создаем матчер на основе стрингбилдера (помещаем текст в матчер) и регулярного выражения (паттерна)
        while (matcher.find()) { // пока матчер находит выражения в тексте равные регулярке делаем след действия
//          String word = matcher.group(); записываем слово=регулрке в строку под названием word
            int start = matcher.start(); // в каждом найденном слове равном регулярке найдем номер символа с которого оно начинается
            int end = matcher.end(); // так же ищем намера последних символов в каждом слове = рег
            int wordLength = end - start;
            dynamicText.setCharAt(start+3, '#'); // заменяем найденные символы на решетку
            if (wordLength >= 7) {
                dynamicText.setCharAt(start+6, '#');
            }
        }
        System.out.println(dynamicText);
    }
}
