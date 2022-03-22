package by.it.kharevich.codewars;

public class Task42 {

    public static String getMiddle(String word) {
        String[] line = word.split("");
        int size = line.length, place;
        String result = "";
        for (String s : line) {
            if (size == 1 | size == 2) {
                result += s;
            } else {
                place = (size+1) / 2;
                if (size % 2 == 0) {
                    result = line[place - 1].concat(line[place]);
                } else {
                    result = line[(place-1)];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("efrtyutc"));

    }
}
