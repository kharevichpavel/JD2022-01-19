package by.it.kharevich.codewars;


import java.util.ArrayList;
import java.util.List;

public class Task53Massiv1UdalitPovtoreniyaMassiv2 {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> c = new ArrayList<Integer>();
        for (int x: a) {
            boolean check = false;
            for (int y: b) {
                if (x == y) check = true;
            }
            if (!check) c.add(x);
        }
        int[] array = c.stream().mapToInt(i -> i).toArray();
        return array;
    }


    public static void main(String[] args) {
        System.out.print(arrayDiff(new int[]{1, 2}, new int[]{1}));

    }
}

/*
public static int[] arrayDiff(int[] a, int[] b) {
    return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
  }
 */

/*
public static int[] arrayDiff(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a = ArrayUtils.removeAllOccurrences(a,b[i]);
        }
        return a;
    }
 */

/*
public static int[] arrayDiff(int[] a, int[] b) {

    ArrayList<Integer> resList = new ArrayList<Integer>();
    for (int i : a)
      resList.add(i);

    for (int i : b)
      while(resList.remove(Integer.valueOf(i)));

    a = new int[resList.size()];
    for (int i = 0; i < a.length; i++)
      a[i] = resList.get(i);

    return a;
  }
 */