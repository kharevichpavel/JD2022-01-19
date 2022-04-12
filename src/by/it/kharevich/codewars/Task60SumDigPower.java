package by.it.kharevich.codewars;

import java.util.ArrayList;
import java.util.List;

public class Task60SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> retList = new ArrayList<Long>();
        for(int i = (int)a; i<= (int)b; i++){
            char[] number = String.valueOf(i).toCharArray();
            int sum = 0;
            for(int j=0; j<number.length;j++){
                sum += (int)Math.pow((number[j] - 48),j+1);
            }
            if(sum == i)
                retList.add(Long.valueOf(i));
        }
        return retList;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,100));

    }
}

/*
public static List<Long> sumDigPow(long a, long b) {
        List<Long> res = new ArrayList<Long>();

        for (long i = a; i <= b; i++) {
          String num = Long.toString(i);
          String[] digits = num.split("");
          double sum = 0;
          for (int j = 1; j <= digits.length; j++) {
            sum += Math.pow(Integer.parseInt(digits[(int) j - 1]), j);
          }
          if (sum == i)
            res.add(i);
        }

        return res;
    }
 */

