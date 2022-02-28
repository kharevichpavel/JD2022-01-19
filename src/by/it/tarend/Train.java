package by.it.tarend;

import by.it.tarend.jd02_01.entity.Good;
import by.it.tarend.jd02_01.utils.RandomData;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Train {

    public static void main(String[] args) {


        HashMap<Good, Double> priceList = new HashMap<Good, Double>();
        for (char i = 'A'; i < 'Z'; i++) {
            String goodName = "Good " + i;
            Good newGood = new Good(goodName, RandomData.get(10, 100));
            priceList.put(newGood, newGood.getPrice());
        }

        Good chosenGood = new Good();
        Set<Good> goods = priceList.keySet();
        int random = RandomData.get(0, goods.size());
        Iterator<Good> iterator = goods.iterator();
        int i = 0;
        while (i < random) {
            chosenGood = iterator.next();
            i++;
        }
        System.out.println();
        System.out.println(chosenGood);
    }
}
