package by.it.kharevich.codewars;

import java.util.*;

public class Task55CountingDuplicates {
    public static int duplicateCount(String text) {
        Map<Character,Integer> result = new HashMap<>();
        Integer[] res = new Integer[0];
        int num = 0;
        for (int i = 0; i < text.length(); i++) {
            Character symbol = text.toLowerCase().charAt(i);
            Integer count = result.get(symbol);
            if (count==null){
                count = 1;
                result.put(symbol,count);
            }else{
                count += 1;
                result.put(symbol,count);
            }
            res = result.values().toArray(new Integer[0]);
        }
        for (Integer re : res) {
            if (re >= 2) {
                num ++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }
}

/*
public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
 */

/*
public static int duplicateCount(String text) {
        List<String> list = Arrays.asList(text.toLowerCase().split(""));
        return (int) list.stream().filter(s -> Collections.frequency(list, s) > 1).distinct().count();
        }
 */