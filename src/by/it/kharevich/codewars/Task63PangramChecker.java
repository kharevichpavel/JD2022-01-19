package by.it.kharevich.codewars;


import java.util.*;


public class Task63PangramChecker {
    public static boolean check(String sentence){
        boolean res = false;
        String example = "abcdefghijklmnopqrstuvwxyz";
        String[] line = sentence.replaceAll("[ \\p{Punct}\\d]","").split("");
        Arrays.sort(line);
        Set<String> collection = new HashSet<>();
        for (String s : line) {
            collection.add(s.toLowerCase());
        }
        String result = collection.toString().replaceAll("[ ,\\[\\]]","").trim();
        return result.equals(example);
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));

    }
}

/*
public boolean check(String sentence){
    return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
 */

/*
 public boolean check(String sentence){
    long result = sentence.toLowerCase().chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();
    return result == 26;
  }
 */

