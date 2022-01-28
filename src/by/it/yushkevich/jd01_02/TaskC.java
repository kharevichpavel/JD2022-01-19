package by.it.yushkevich.jd01_02;

import java.util.Random;
import java.util.Scanner;

public class TaskC {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[][] arr = step1(n);
        step2(arr);






    }




    private static void step2(int[][] arr) {

        int sum = 0;
        int counter = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i][j]>0){
                    counter++;

                }

                }


            }

        }
        //System.out.println(sum);







    private static int[][] step1(int n) {

        int[][] arr = new int[n][n];


        while (true){
            int max = 0;  // счетчики на наличие в матрице значение -n и +n
            int min = 0;

            for (int i = 0; i < arr.length; i++){  // заполняем матрицу случайными цифрами

                for (int j = 0; j< arr.length; j++){
                    Random random = new Random();
                    arr[i][j] = -n + random.nextInt(2*n+1);

                }

            }

            for (int i = 0; i < arr.length; i++) {  // проверка на наличие в матрице чисел минус эн и плюс эн, если какое-то есть, то счетчики увеличиваются
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j]== -n){
                        min = min+1;
                    }
                    if (arr[i][j] == n){
                        max = max+1;
                    }
                }
            }

            if (max>0 && min>0){  //если оба значение больше 0, значит в матрице есть хотя бы по одному значение эн и минус эн и мы прерываем цикл вайл
                break;
            }
        }


        for(int i = 0; i < arr.length; i++){ // выводим матрицу в консоль, если все ок, если есть -n и +n

            for (int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]+" | ");

            }
            System.out.println("");


        }


        return arr;
    }
}
