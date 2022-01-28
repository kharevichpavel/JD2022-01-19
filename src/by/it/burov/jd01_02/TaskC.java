package by.it.burov.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        step1(n);
        step2(step1(n));
    }

    public static int[][] step1(int n) {
        int[][] array = new int[n][n];
        Random random = new Random();
        while (true) {
            int min = 0;
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = -n + random.nextInt(2 * n + 1);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] < min) {
                        min = array[i][j];
                    } else if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
            if (min == -n && max == n) {
                break;
            }
        }
        return array;
    }

    public static int step2(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            int counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (counter == 0) {
                    if (array[i][j] > 0) {
                        counter++;
                    }
                } else if (counter == 1) {
                    if (array[i][j] > 0) {
                        counter++;
                    } else {
                        sumLine += array[i][j];
                    }
                }
                if (counter == 2) {
                    sum += sumLine;
                }
            }
        }
        return sum;
    }

    public static int[][] step3(int[][] array){
        int max = Integer.MAX_VALUE;
        for (int[] row : array){
            for (int element : row){
                if(max<element){
                    max = element;
                }
            }
        }
        boolean[] deleteRow = new boolean[array.length];
        boolean[] deleteColumn = new boolean[array[0].length];


        for (int i = 0; i<array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if(array[i][j]== max){
                    deleteRow[i]=true;
                    deleteColumn[j]=true;
                }
            }
        }
        int rows = 0;
        for (boolean delete : deleteRow) {
            if (!delete) {
                rows++;
            }
        }

        int columns = 0;
        for (boolean delete : deleteColumn){
            if(!delete){
                columns++;
            }
        }
        int[][] result = new int[rows][columns];

        for (int i = 0, indexRow = 0; i < array.length; i++) {
            if(!deleteRow[i]){
                for (int j = 0, indexColumn = 0; j < array.length; j++) {
                    if(!deleteColumn[j]){
                        result[indexRow][indexColumn] = array[i][j];
                    }
                }
                indexRow++;
            }
        }
        return result;

    }
}