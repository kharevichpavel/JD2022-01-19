package by.it.chaikova.jd01_03;

class InOut {
    static double[] getArray(String line) {
        line = line.trim();
        String[] parts = line.split(" ");
        int count = parts.length;
        double[] resultData = new double[count];
        //double [] resultData= new double[parts.length];
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

    static void printArray(double[] array, String name, int columnCount) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-10.4f ", name, i, array[i]);
            if (((i + 1) % columnCount == 0) || (array.length == i + 1)) {
                System.out.println();
            }
        }
    }
}
