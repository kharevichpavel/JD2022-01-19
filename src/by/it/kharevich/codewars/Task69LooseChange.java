package by.it.kharevich.codewars;

import java.util.HashMap;

public class Task69LooseChange {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        int q = 0, d = 0, n = 0, p = 0;
        if (cent>0){
            if (cent%25>=1 || cent%25==0){
                q = Math.round(cent/25);
                map.put("Quarters", q);
            }
            if ((cent-q*25)%10>=1 || (cent-q*25)%10==0){
                d = Math.round((cent-q*25)/10);
                map.put("Dimes", d);
            }
            if ((cent-q*25-d*10)%5>=1 || (cent-q*25-d*10)%5==0){
                n = Math.round((cent-q*25-d*10)/5);
                map.put("Nickels", n);
            }
            p = (cent-q*25-d*10-n*5);
            map.put("Pennies", p);
        }else {
            map.put("Quarters", 0);
            map.put("Dimes", 0);
            map.put("Nickels", 0);
            map.put("Pennies", 0);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(looseChange(57725));


    }
}

/*
public static HashMap<String, Integer> looseChange(int cent) {
        int c = Math.max(0, cent);
        return new HashMap<String, Integer>() { {
            put("Quarters", c / 25);
            put("Dimes", c % 25 / 10);
            put("Nickels", c % 25 / 5 & 1);
            put("Pennies", c % 5);
        } };
    }
 */