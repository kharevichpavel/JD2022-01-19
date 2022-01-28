package by.it.tarend.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);
    }

    private static void step1(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            min = Math.min(element, min);
            max = Math.max(element, max);
        }

        System.out.println(min + " " + max);
    }
    private static void step2(int[] arr) {
        double sum = 0;
        double average;

        for (int element : arr) {
            sum += element;
        }

        average = sum / arr.length;

        for (int element : arr) {
            if (element < average) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
    private static void step3(int[] arr) {

        int min = arr[0];

        for (int element : arr) {
            min = Math.min(element, min);
        }

        for (int index = arr.length - 1; index >= 0; index--) {
            if (arr[index] == min) {
                System.out.print(index + " ");
            }
        }
    }
}
