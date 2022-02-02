package by.it.yushkevich.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        printMulTable();
        System.out.println("------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        String mas = scanner.nextLine();
        buildOneDimArray(mas);
        System.out.println("------------------------------------------------------");

    }



    static void printMulTable(){
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10 ; j++) {

                System.out.printf("%1d*%1d=%-3d",i, j, i*j);

            }
            System.out.println();

        }
    }

    static void buildOneDimArray(String line){

        double[] array = InOut.getArray(line);  //getArray уже был готов с прошлого задания

        InOut.printArray(array,"V", 5);

        double firstElement = array[0];
        double lastElement = array[array.length-1];

        Arrays.sort(array);
        System.out.println("----After sorting----");
        InOut.printArray(array, "V", 4);


        int indexFirst = Arrays.binarySearch(array, firstElement);
        int indexLast = Arrays.binarySearch(array, lastElement);
        System.out.printf("Index of first element=%d\n",indexFirst);
        System.out.printf("Index of last element=%d\n", indexLast);

        /*  это плохой способ, очень затрантный, т.к. массив уже отсортирован, то может юзать бинарный поиск --- очень быстрый!
        for (int i = 0; i < array.length; i++) {
            if (firstElement==array[i]){
                System.out.printf("Index of first element=%d\n",i);
                break; //если нашли, то не нужно чтоб цикл продолжаелся
                }

        }

        for (int i = 0; i < array.length; i++) {
            if (lastElement == array[i]) {
                System.out.printf("Index of last element=%d\n", i);
                break;
            }

        }
        */



    }

}
