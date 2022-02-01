package by.it.yushkevich.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {

        int[] array = {9,8,7,6,5,4,3,2,1,0};
        sort(array);
//        Arrays.sort();

    }




    private static void sort(int[] array) {
        while (true){
            int midle = (array[0]+array.length)/2;

//            int[] arrayLeft = new int[];

        }


    }

    public static int[] merge(int[] arr, int start, int end){
        start = 0;
        end = arr.length;
        int midle = (start+end)/2;
        int[] newLeft = Arrays.copyOfRange(arr,start,midle);
        int[] newRight = Arrays.copyOfRange(arr,midle+1,end);
        





        return null;
    }


    static void buildOneDimArray(String line){

        double[] array = InOut.getArray(line);  //getArray уже был готов с прошлого задания

        InOut.printArray(array,"V", 5);

        double firstElement = array[0];
        double lastElement = array[array.length-1];

       // Arrays.sort(array); //нужно переделать метод сорт

        System.out.println("----After sorting----");
        InOut.printArray(array, "V", 4);


        int indexFirst = Arrays.binarySearch(array, firstElement);
        int indexLast = Arrays.binarySearch(array, lastElement);
        System.out.printf("Index of first element=%d\n",indexFirst);
        System.out.printf("Index of last element=%d\n", indexLast);


    }







}
