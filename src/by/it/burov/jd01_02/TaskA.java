package by.it.burov.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);

    }
        static void step1(int[] array){
        int min = array[0];
        int max = array[0];
        for (int element : array){
            min = Math.min(element, min);
            }
        for (int element : array){
            max = Math.max(element, max);
            }
            System.out.println(min + " " + max);

        }

        static void step2(int[] array){
        double sum = 0;
        for (int element : array){
            sum = sum + element;
        }
        double average=sum/array.length;
            for (int element : array){
                if (element<average){
                    System.out.print(element);
                }
            }
    }
        static void step3(int[] array){
            int min = array[0];
            for (int element : array){
                min = Math.min(element, min);
            }
            for (int i = array.length - 1; i >= 0; i--) {
                if(array[i] == min){
                    System.out.print(i + " ");
                }
            }
        }
}

