package by.it.kuzma.jb01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();


        step1(n);

    }

    private static int[][] step1(int n) {
        int[][] array = new int[n][n];


        int counterMax = 0;
        int counterMin = 0;
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                Random random = new Random();
                int numb = -n + random.nextInt(2 * n + 1);
                array[i][j] = numb;
                System.out.print(array[i][j] + " ");
                if (numb == n) {
                    counterMax++;
                }
                if (numb == -n) {
                    counterMin++;
                }

            }
            System.out.println();
            if (i == n - 1) {
                if (counterMax > 0) {
                    if (counterMin == 0) {
                        i = -1;
                        counterMax = 0;
                        counterMin = 0;
                    }
                } else {
                    i = -1;
                    counterMax = 0;
                    counterMin = 0;
                }
            }


        }
        return array;
    }
}
