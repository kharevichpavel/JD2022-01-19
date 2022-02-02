package by.it.yushkevich.jd01_02;


import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in); //stub!
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        step1(array);
        step2(array);
        step3(array);


    }



    private static void step1(int[] array) {  // min and max in array

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(min + " " + max);

    }


    private static void step2(int[] array) {

        double sum = 0;
        for (int i : array) {
            sum+=i; // sum = sum + 1;
        }

        double average = sum/array.length;
        for (int element : array) {
            if (element < average){
                System.out.println(element);
            }
        }
    }


    private static void step3(int[] array) {

        int min = array[0];
        for (int element : array) {
            if (element < min){
                min = element;
            }
        }

        for (int index = array.length - 1; index >= 0; index--) {

            if (array[index]==min){
                System.out.print(index + " ");
            }

        }
    }


}
