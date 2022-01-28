package by.it.kharevich.jd01_02;


import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        step1(n);

        int[][] arr = new int[n][n];
        step2(arr);
        step3(arr);


    }

    private static int[][] step1(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = -n + (int) (Math.random() * ((n + n) + 1));
                System.out.print(arr[i][j] + " ");
                }
            System.out.println();
            }
        return arr;
    }

    private static int step2(int[][] arr) {
        int sumElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {


                sumElement = sumElement + j;



            }
        }

        System.out.print(sumElement);
        return sumElement;
    }

    private static void step3(int[][] arr) {

    }
}
