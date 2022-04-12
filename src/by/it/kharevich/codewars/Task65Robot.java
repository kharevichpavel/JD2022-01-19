package by.it.kharevich.codewars;

import java.util.*;
import java.util.regex.Pattern;

public class Task65Robot {
    public static Set<String> list = new HashSet<>(Arrays.asList("thank", "you", "for", "teaching", "me", "i", "already", "know", "the", "word", "do", "not", "understand", "input"));
    public static String learnWord(String word){
        if(Pattern.matches("[a-zA-Z]+", word)){
            if(list.add(word.toLowerCase())){
                return "Thank you for teaching me "+word;
            }
            return "I already know the word "+word;
        }
        return "I do not understand the input";
    }


    public static void main(String[] args) {
        System.out.println(learnWord("word"));

    }



}
/*
words.add(Lword);
  t = "Thank you for teaching me "+word;
  return t; */