package by.it.kharevich.codewars;
/*
Дан массив целых чисел, найдите то, которое встречается нечетное количество раз.

Всегда будет только одно целое число, которое встречается нечетное количество раз.

Примеры
[7]должен вернуть 7, потому что это происходит 1 раз (что нечетно).
[0]должен вернуть 0, потому что это происходит 1 раз (что нечетно).
[1,1,2]должен вернуть 2, потому что это происходит 1 раз (что нечетно).
[0,1,0,1,0]должен вернуть 0, потому что он встречается 3 раза (что нечетно).
[1,2,2,3,3,3,4,3,3,3,2,2,1]должен вернуть 4, потому что он появляется 1 раз (что нечетно).
 */

import java.util.TreeSet;

public class Task48DublicatiInArray {

    public static int findIt(int[] a) {
        final TreeSet<Integer> set = new TreeSet<>();
        for (int x : a) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return set.first();
    }

  //  public static void main(String[] args) {
  //      System.out.println(findIt(new int[]{10}));

  //  }
}
/*
final TreeSet<Integer> set = new TreeSet<>();
        for (int x : A) {
            if (set.contains(x)) {
                set.remove(x);
            } else {
                set.add(x);
            }
        }
        return set.first();
 */

/* int result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (count.containsKey(a[i])) {
                count.put(a[i], count.get(a[i]) + 1);
            } else {
                count.put(a[i], 1);
            }
            if (count.get(a[i])%2!=0){
                result = a[i];
            }
        }
       // System.out.println(count);
        return result;*/