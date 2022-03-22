package by.it.kharevich.codewars;

public class Task33 {

    public static int findShort(String s) {
        String[] words = s.trim().split(" ");
        int min = words[0].length();
        for (int i = 0 ; i < words.length; i++) {
            if (words[i].length()<min){
                min= words[i].length();
            }
        }
        return min;
    }
}
