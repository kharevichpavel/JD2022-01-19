package by.it.tarend.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {

        int n;
        int sum;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] array;

        array = step1(n);
        sum = step2(array);
        int[][] newArray = step3(array);

    }

    private static int[][] step1(int n) {

        int[][] arr = new int[n][n];
        Random rand = new Random();

        boolean ifElementPlusN = false;
        boolean ifElementMinusN = false;
        while (!ifElementPlusN || !ifElementMinusN) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (-n) + rand.nextInt(2 * n + 1);
                    if (arr[i][j] == n) {
                        ifElementPlusN = true;
                    }
                    if (arr[i][j] == (-n)) {
                        ifElementMinusN = true;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
        return arr;
    }

    private static int step2(int[][] array) {

        int sum = 0;
        int[] sumRow = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            boolean isStartSum = false;
            boolean isFinishSum = false;
            for (int j = 0; j < array[i].length; j++) {
                if (!isStartSum) {
                    if (array[i][j] > 0) {
                        isStartSum = true;
                        continue;
                    }
                }
                if (isStartSum) {
                    if (array[i][j] <= 0) {
                        sumRow[i] += array[i][j];
                    } else {
                        isFinishSum = true;
                        break;
                    }
                }
            }
            if (isStartSum && !isFinishSum) {
                sumRow[i] = 0;
            }
        }
        for (int element : sumRow) {
            sum += element;
        }
        System.out.println(sum);
        return sum;
    }
    static int[][] step3(int[][] arr) {

        return null;
    }
}
