package by.it.kharevich.codewars;

public class Task14 {

    public static String countingSheep(int num) {
        String line = "";
        for (int i = 1; i <= num; i++) {
            line = line.concat(i +" sheep...");
        }
        return line;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(5));

    }
}
