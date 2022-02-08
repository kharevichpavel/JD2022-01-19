package by.it.kharevich.jd01_04;


import java.util.Locale;

class InOut {

    static double[] getArray(String line) {
        line = line.trim();
        String[] partsLine = line.split(" ");
        double[] resultData = new double[partsLine.length];
        for (int i = 0; i < resultData.length; i++) {
            resultData[i] = Double.parseDouble(partsLine[i]);
        }
        return resultData;
    }

    static void printArray(double[] array, int columnCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf(Locale.ENGLISH, "%s[% -3d]=%-10.4f ", "V", i, array[i]);
            if (((i + 1) % columnCount == 0) || (array.length == i + 1)) {
                System.out.println();
            }

        }
    }
}
