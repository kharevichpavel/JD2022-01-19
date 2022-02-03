package by.it.chaikova.jd01_02;


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

    private static void step3(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element<min){
                min= element;
        }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i]==min){
                System.out.print(i+ " ");
            }
        }
    }

    private static void step2(int[] array) {
        int sum=0;
        for (int element : array) {
            sum+=element;
        }
        double average=(double) sum/array.length;
        for (int element : array) {
            if (element<average) {
                System.out.print(element+ " ");
            }
        }
        System.out.println();
    }

    static void step1(int[] array) {
        int min;
        int max;
        min = max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("min and max " + min + " " + max);
    }

}


