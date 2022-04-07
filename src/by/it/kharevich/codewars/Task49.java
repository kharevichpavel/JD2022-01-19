package by.it.kharevich.codewars;


import java.util.HashSet;
import java.util.Set;

public class Task49 {

    public static boolean comp(int[] a, int[] b) {
        Set <Integer> resA = new HashSet<>();
        Set <Integer> resB = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            resA.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            resB.add((int) Math.sqrt(b[i]));
        }
        if (a.length != b.length){
            return false;
        }else if (a.length==0){
            return true;
        }else if (resA.containsAll(resB)) {
            return true;
        }else {
            return false;
        }
    }
}

/*
 public static boolean comp(int[] a, int[] b) {
        if(a==null||b==null){
            return false;
        }else {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) Math.pow((a[i]), 2.0);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        }
    }
 */