package by.it.kharevich.jd01_15;

import by.it.kharevich.jd01_14.PathFinder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskA {

    public static final String ROOT = "src";
    public static final String FILENAME = "matrix.txt";

    public static void main(String[] args) {
        int[][] matrix = createMatrix(6, 4, -15, 15);
        String filename = PathFinder.getFilename(TaskA.class, ROOT, FILENAME);
        save2DArrayToTxtFile(matrix, filename);
        List<String> strings = getStringsFromTxtFile(filename);
        printToConsole(strings);
    }

    private static void printToConsole(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static List<String> getStringsFromTxtFile(String filename) {
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            throw new RuntimeException("IO ERROR" + filename, e);
        }
    }

    private static void save2DArrayToTxtFile(int[][] matrix, String filename) {
        try (PrintWriter printWriter = new PrintWriter(filename)) {
            for (int[] row : matrix) {
                for (int element : row) {
                    printWriter.printf("%3d ", element);
                }
                printWriter.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("IO ERROR" + filename, e);
        }
    }

    @SuppressWarnings("SameParameterValue")
    private static int[][] createMatrix(int rows, int columns, int minValue, int maxValue) {
        int[][] array = new int[rows][columns];
        for (int[] row : array) {
            for (int i = 0; i < row.length; i++) {
                row[i] = minValue + ThreadLocalRandom.current().nextInt(maxValue - minValue + 1);
            }
        }
        return array;
    }
}
