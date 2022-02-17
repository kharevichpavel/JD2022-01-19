package by.it.katsal.jd01_06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder textDinamic = new StringBuilder(Poem.text);
        Pattern regularFormule = Pattern.compile("[а-яА-ЯЁё]{4,}");
        Matcher matcher = regularFormule.matcher(textDinamic);
        while (matcher.find() ){
            int start = matcher.start();
            int end = matcher.end();
            int size =  end - start;

            textDinamic.setCharAt(start+3,'#' );
            if (size >= 7){
                textDinamic.setCharAt(start+6,'#' );
            }


        }
        System.out.println(textDinamic);


        



    }

}
