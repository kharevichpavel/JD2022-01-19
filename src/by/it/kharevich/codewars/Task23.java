package by.it.kharevich.codewars;

import java.util.Random;

public class Task23 {

    public static int mxdiflg(String[] a1, String[] a2) {
        String x = a1[(int) (Math.random()*a1.length-1)];
        String y = a2[(int) (Math.random()*a2.length-1)];
        int result = (Math.abs(x.length()-y.length()));
        System.out.printf("%s " + "%s ",x,y);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mxdiflg(new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"}, new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));

    }
}

/*
int maxlen=-1;
        for(String x:a1){
           for(String y:a2){
            if(Math.abs(x.length()-y.length())>maxlen)
            maxlen=Math.abs(x.length()-y.length());
           }
        }
        return maxlen;
 */