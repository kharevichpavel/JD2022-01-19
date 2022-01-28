package by.it.tarend.jd01_03;

class InOut {
    static double[] getArray(String line) {
        // 559 56 54 2 13 11 -8 0

        line = line.trim();
        String[] lineParts = line.split(" ");
        double[] resultArray  = new double[lineParts.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = Double.parseDouble(lineParts[i]);
        }
        return resultArray;
    }

    static void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

     static void printArray(double[] array, String nameOfArray, int columnCount) {
        // v[ 0 ] = 111.222    v[ 1 ] = 222.111
        for (int index = 0; index < array.length; index++) {
            if (((index+1) % columnCount == 0) || (index+1 == array.length)) {
                System.out.printf("%s[% -3d]=%-10.3f\n", nameOfArray, index, array[index]);
            } else {
                System.out.printf("%s[% -3d]=%-10.3f\t", nameOfArray, index, array[index]);
            }
        }
    }
}
