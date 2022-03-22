package by.it.kharevich.codewars;

public class Task35 {

    public static String greet(String name){
        String[] s = name.toLowerCase().split("");
        String result = "";
        for (int i = 0; i < s.length; i++) {
            s[0] = s[0].toUpperCase();
            result += String.valueOf(s[i]);
        }
        return "Hello " + result + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("garry"));

    }
}
