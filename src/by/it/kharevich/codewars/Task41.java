package by.it.kharevich.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task41 {

    public static String longest (String s1, String s2) {
        Stream<String> sort = Arrays.stream(s1.concat(s2).split("")).distinct().sorted();
        return sort.collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(longest("aretheyhere", "yestheyarehere"));

    }
}
