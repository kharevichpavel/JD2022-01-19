package by.it.chaikova.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {


        System.out.println("Step1:");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= scanner.nextInt();
        step1(n);
        }

    private static void step1(int n) {
        Random r = new Random(System.currentTimeMillis());
        int[][] array = new int[n][n];
        for (int t = 0; t < n; t++) {
            for (int j = 0; j < n; j++) {
                array[t][j] = r.nextInt(n+n)-n;
                System.out.print(array[t][j] + " ");
            }
            System.out.println();
        }
    }
}


