package by.it.skorobogatyi.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);
    }

    public static void step1(int[] arrayInStep1) {

        int min = arrayInStep1[0];
        int max = arrayInStep1[0];

        for (int element : arrayInStep1) {

            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }
        }
        System.out.println(min + " " + max);
    }

    public static void step2(int[] arrayInStep2) {

        double sum = 0;

        for (int element : arrayInStep2) {
            sum += element;
        }

        double average = sum / arrayInStep2.length;

        for (int element : arrayInStep2) {
            if (element < average) {
                System.out.println(element + " ");
            }
        }
    }

    public static void step3(int[] arrayInStep3) {

        int min = arrayInStep3[0];

        for (int element : arrayInStep3) {
            if (element < min) {
                min = element;
            }
        }

        for (int i = arrayInStep3.length - 1; i >= 0; i--) {
            if (arrayInStep3[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}