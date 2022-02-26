package by.it.kustova.jd01_15;

import by.it.kustova.jd01_14.PathFinder;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {
    public static void main(String[] args) {
        int [][] matrix = createMatrix(4,6,-15,15);
        String filename =PathFinder.getFilename(TaskA.class, "src", "matrix.txt");
        save(matrix, filename);

    }

    private static void save(int[][] matrix, String filename) {
       try (PrintWriter printWriter = new PrintWriter(filename)){
           for (int[] row : matrix) {
               for (int element : row) {
                   printWriter.printf("%3d ", element);
               }
               printWriter.println();
           }
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("SameParameterValue")
    private static int [][]  createMatrix(int rows,
                                          int columns,
                                          int minValue,
                                          int maxValue) {
        int [][] array = new int [rows][columns];
        for (int[] row : array) {
            for (int i = 0; i < row.length; i++) {
                row[i]= minValue+ ThreadLocalRandom.current().nextInt(maxValue-minValue+1);
            }
        }
        return array;
    }
}
