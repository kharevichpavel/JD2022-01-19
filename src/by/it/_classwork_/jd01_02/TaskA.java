package by.it._classwork_.jd01_02;


import java.util.Random;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        var integer = Integer.valueOf(200);
        System.out.println(integer.getClass());
        if (System.nanoTime()>0){
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);

        Random random = new Random();
        int n = 5;
        int i = -n + random.nextInt(2 * n + 1);
    }

    private static void step1(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println(min + " " + max);
    }

    private static void step2(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        double average = sum / array.length;
        for (int element : array) {
            if (element < average) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    private static void step3(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        for (int index = array.length - 1; index >= 0; index--) {
            if (array[index] == min) {
                System.out.print(index + " ");
            }
        }
    }


}
