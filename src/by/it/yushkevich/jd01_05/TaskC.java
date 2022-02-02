package by.it.yushkevich.jd01_05;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {

    public static void main(String[] args) {

        createArray();


    }

    private static void createArray() {
        int a = 20;
        double x = 5.33; // по условию 5.33<=x<=9
        int size = a + (int) (Math.random() * 21); // задаем размер массива от 20 до 40
        double[] arrayFirst = new double[size];
        double n = (9 - 5.33) / size; // высчитываем шаг для заполнения массива

        //высчитываем Х добавляя к нему шаг n и заполняем массив.
        for (int i = 0; i < arrayFirst.length; i++) {

            x = x + n;
            double z = cbrt(pow(x, 2) + 4.5);
            arrayFirst[i] = z;

        }

        System.out.println("Массив A[]");
        // выводим индексы и значения массива
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.printf("Массив A[%2d] %-15.5f", i, arrayFirst[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }


        createNewArray(arrayFirst);


    }


    private static void createNewArray(double[] array) {

        //находим количество ячеек больше 3.5 (т.к. массив отсортирован, можно найти первый элемент, и вычесть от длинны массива индекс первого элемета.

        int elemsInSecondArray = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 3.5) {
                elemsInSecondArray++;
            }
        }
        // копируем из первого массива во второй значения от индекса до конца. модно было циклами
        double[] secondArray = new double[elemsInSecondArray];


        //secondArray = Arrays.copyOfRange(array, array.length - elemsInSecondArray, array.length);

        for (int i = 0, counter = 0; i < array.length; i++) {
            if (array[i] > 3.5) {
                secondArray[counter] = array[i];
                counter++;
            }
        }

        System.out.println();
        System.out.println("Массив B[] из элементов массива A > 3.5");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("Массив B[%2d] %-15.5f", i, secondArray[i]);
            if ((i+1)%5==0){
                System.out.println();
            }
        }
        double mult = 1;
        for (int i = 0; i < secondArray.length; i++) {
            mult = mult * secondArray[i];
        }

        double average = pow(mult, 1. / elemsInSecondArray);
        System.out.println();
        System.out.printf("При размере массива равном %d, произведении всех элементов между собой равноа %f%n  среднее геом = %f", elemsInSecondArray, mult, average);
    }


}
