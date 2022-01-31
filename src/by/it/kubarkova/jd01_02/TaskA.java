package by.it.kubarkova.jd01_02;


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

    private static void step3(int[] arrayInMethod) {
        int min = arrayInMethod[0];
        for (int element : arrayInMethod) {
            min = Math.min(element, min);
        }
        for (int i = arrayInMethod.length - 1; i >= 0; i--) {
            if (arrayInMethod[i]==min){
                System.out.print(i+" ");
            }
            
        }

    }

    private static void step2(int[] arrayInMethod) {
        double sum=0;
        for (int element: arrayInMethod) {
            sum=sum+element;
        }
        double average=sum/arrayInMethod.length;
        for (int element : arrayInMethod) {
            if (element<average){
                System.out.print(element+" ");
            }

        }
        System.out.println();
    }

    private static void step1(int[] arrayInMethod) {
        int min = arrayInMethod[0];
        int max = arrayInMethod[0];
        for (int element : arrayInMethod) {
            min = Math.min(element, min);
            max = Math.max(element, max);
        }


        System.out.println(min + " " + max);
    }
}
