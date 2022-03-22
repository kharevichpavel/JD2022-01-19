package by.it.kharevich.codewars;
/*
Завершите метод, который принимает массив целых чисел и возвращает одно из следующих значений:

"yes, ascending"- если числа в массиве отсортированы по возрастанию
"yes, descending"- если числа в массиве отсортированы по убыванию
"no"- иначе
Вы можете предположить, что массив всегда будет действительным, и всегда будет один правильный ответ.
 */

import java.util.Arrays;

public class Task43 {

    public static String isSortedAndHow(int[] array) {
        String result;
        String origin = Arrays.toString(array).replaceAll("[\\[\\] ]","");
        Arrays.sort(array);
        String sort = Arrays.toString(array).replaceAll("[\\[\\] ]","");
        int[] descArray = new int[array.length];
        Arrays.sort(descArray);
        for(int i=0; i<array.length; i++) {
            descArray[i] = array[(array.length-1)-i];
        }
        String revers = Arrays.toString(descArray).replaceAll("[\\[\\] ]","");
        if (origin.equals(sort)){
            result = "yes, ascending";
        }else if (origin.equals(revers)){
            result = "yes, descending";
        }else {
            result = "no";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isSortedAndHow(new int[] {3, 2, -1}));

    }
}

/*
boolean descending = true, ascending = true;
      for (int i = 1; i < array.length; i++) {
        if (array[i-1] < array[i]) descending = false;
        else ascending = false;
      }
      return ascending  ? "yes, ascending" :
             descending ? "yes, descending" : "no";
 */