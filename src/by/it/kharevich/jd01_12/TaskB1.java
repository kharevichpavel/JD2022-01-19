package by.it.kharevich.jd01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {

    public static final String REGEX = "[a-zA-Z']+";

    public static void main(String[] args) {

        HashMap<String, Integer> textLine = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String textAll = scanner.next();
            if (textAll.equals("end")){
                break;
            }else{
                Pattern pattern = Pattern.compile(REGEX);
                Matcher matcher = pattern.matcher(textAll);
                while (matcher.find()){
                    String text = matcher.group();
                    if (!text.equals("") && !textLine.containsKey(text)){ //не равно промежутку и еще не содержит ключ в карте;
                        textLine.put(text,1); // ложим ключ текст (слово из текста) со значением 1;
                    } else{
                        int countWord = textLine.get(text);
                        textLine.replace(text,countWord,countWord+1);// если больше 1, убираем старый ключ, перезаписываем новый и добавляем +1 к значению;
                    }
                }
            }
        }
        ArrayList<Map.Entry<String, Integer>> resultLine = new ArrayList<>(textLine.entrySet());
        for (Object o : resultLine) {
            System.out.printf("%s\n", o);
        }
    }
}


