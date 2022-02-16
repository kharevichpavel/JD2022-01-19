package by.it.kharevich.jd01_12;

import java.util.*;
import java.util.regex.Pattern;

public class TaskB1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            String text = scanner.next();
            if (!text.equals("end")){
                Pattern pattern = Pattern.compile("[^a-zA-Z’']+");
                String[] splitText = pattern.split(text);
                List<String> textList = Arrays.asList(splitText);
                for (int i = 0; i < textList.size(); i++) {


                }

                System.out.print(textList);
            }else{
                break;
            }
        }
    }
}


