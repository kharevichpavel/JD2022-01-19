package by.it.burov.jd01_15;

import by.it.burov.jd01_14.PathFinder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {
    private static final String SRC = "src";
    private static final String MATRIX = "matrix.txt";

    public static void main(String[] args) {
        int[][] matrix = createMatrix(6,4,-15,15);
        String filename = PathFinder.getFilename(TaskA.class,SRC,MATRIX);
        save2DArrayToTxtFile(matrix,filename);
        List<String> lines = getLinesFromTxtFile(filename);
        printToConsole(lines);
    }

    private static int[][] createMatrix(int rows, int columns, int minValue, int maxValue){
        int[][] array = new int[rows][columns];
        for (int[] row : array){
            for (int i = 0; i <row.length; i++){
                row[i] = minValue + ThreadLocalRandom.current().nextInt(maxValue-minValue+1);
            }
        }
        return array;
    }

    private static void save2DArrayToTxtFile(int[][] matrix, String filename) {
        try(PrintWriter printWriter = new PrintWriter(filename)){
            for (int[]row : matrix){
                for (int element : row) {
                    printWriter.printf("%3d ",element);
                }
                printWriter.println();
                }
        }catch (FileNotFoundException e){
            throw new RuntimeException("IO error: " + filename,e);
        }
    }

    private static List<String> getLinesFromTxtFile(String filename) {
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException("IO error: " + filename,e);
        }
    }

    private static void printToConsole(List<String> lines) {
        System.out.println(lines);
    }
}
