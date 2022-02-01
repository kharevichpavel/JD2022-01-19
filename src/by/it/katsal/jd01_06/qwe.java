package by.it.katsal.jd01_06;
import java.util.Arrays;
public class qwe {





    public static void main(String[] args) {
        String s = "What I've felt\n" +
                "What I've known\n" +
                "Never shined through in what I've shown\n" +
                "Never be\n" +
                "Never see\n" +
                "Won't see what might have been\n" +
                "What I've felt\n" +
                "What I've known\n" +
                "Never shined through in what I've shown\n" +
                "Never free\n" +
                "Never me\n" +
                "So I dub thee unforgiven\n";

        Arrays.stream(s.split("\\s+"))
                .filter(x->x.charAt(0)>='A'&&x.charAt(0)<='Z')
                .forEach(System.out::println);

        String letters = "BCDFGHGKLMNPRSTVWXZ";
        for (String word:s.split("\\s+")) {
            if (letters.contains(word.substring(0,1)))
                System.out.println(word);


        }
    }
}
