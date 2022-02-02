package by.it.katsal.jd01_06;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class TaskB1 {



    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[а-яА-яёЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
             while(matcher.find()){
              String word = matcher.group();
                 if (processOneWord(word)){
                   System.out.println(word );
               }
             }
           }
    private static boolean  processOneWord(String word) {
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);





        String[] letters = {"А а О о У у Э э Ы ы Я я Ё ё Е е Ю ю И и"};
            return();
         }

    }

