package by.it.khmelov.jd01_02;

public class TaskC {

    static int[][] step3(int[][] array) {
        int max = getMax(array);
        boolean[] deleteRow = new boolean[array.length];
        boolean[] deleteCol = new boolean[array[0].length];
        fillDeleteFlags(array, max, deleteRow, deleteCol);
        int rows = getFalseCount(deleteRow);
        int cols = getFalseCount(deleteCol);
        return buildResultArray(array, deleteRow, deleteCol, rows, cols);
    }

    private static int getMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }

    private static void fillDeleteFlags(int[][] array, int max, boolean[] deleteRow, boolean[] deleteCol) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) {
                    deleteRow[i] = true;
                    deleteCol[j] = true;
                }
            }
        }
    }

    private static int getFalseCount(boolean[] deleteRow) {
        int rows = 0;
        for (boolean delete : deleteRow) {
            if (!delete) rows++;
        }
        return rows;
    }

    private static int[][] buildResultArray(int[][] array, boolean[] deleteRow, boolean[] deleteCol, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0, indexRow = 0; i < array.length; i++) {
            if (!deleteRow[i]) {
                for (int j = 0, indexCol = 0; j < array[i].length; j++) {
                    if (!deleteCol[j]) {
                        result[indexRow][indexCol++] = array[i][j];
                    }
                }
                indexRow++;
            }
        }
        return result;
    }
}
