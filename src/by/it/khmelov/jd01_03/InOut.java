package by.it.khmelov.jd01_03;

import java.util.Locale;

class InOut {
    static double[] getArray(String line) {
        // 11 22 33 66 99 0 123 -9
        line = line.trim();
        String[] parts = line.split(" ");
        double[] resultData = new double[parts.length];
        for (int i = 0; i < resultData.length; i++) {
            resultData[i] = Double.parseDouble(parts[i]);
        }
        return resultData;
    }

    static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static void printArray(double[] array, String name, int columnCount) {
        //V[ 0 ]=123.456  V[1]=-0.123
        for (int i = 0; i < array.length; i++) {
            System.out.printf(Locale.ENGLISH,"%s[% -3d]=%-10.4f ", name, i, array[i]);
            if (((i + 1) % columnCount == 0) || (array.length == i + 1)) {
                System.out.println();
            }
        }
    }
}
