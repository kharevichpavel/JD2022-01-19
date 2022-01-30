package by.it.kravchenko.jd01_04;

class InOut {
    static double[ ] getArray(String line){
     line = line.trim();
        String[] parts = line.split(" ");
        double [] result = new double[parts.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Double.parseDouble(parts[i]);
        }
        return result;

    }
    static void printArray(double[ ] array){
        for (double element : array) {
            System.out.println(element);
        }
    }
    static void printArray(double[ ] array, String name, int columnCount){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s[% -3d]=%-8.4f ", name, i, array[i] );
            if (((i+1)%columnCount==0) || (array.length == i+1)){
                System.out.println();
            }

        }

    }
}
