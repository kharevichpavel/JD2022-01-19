package by.it.katsal.jd01_06;


import java.util.Locale;
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
        char firstLetters = word.charAt(0);
        char lastLetters = word.charAt(word.length() - 1);
        String vowels = "А а О о У у Э э Ы ы Я я Ё ё Е е Ю ю И и";
        String consonants = "Б б В в Г г Д д Ж ж З з Й й К к Л л М м Н н П п Р р С с Т т Ф ф Х х Ц ц Ч ч Ш ш Щ щ";
        consonants = consonants + consonants.toLowerCase(Locale.ROOT);
        vowels = vowels.toLowerCase(Locale.ROOT);
        return ((consonants.indexOf(firstLetters) >= 0 ) && (vowels.indexOf(lastLetters )>=0 ));
    }

    }

