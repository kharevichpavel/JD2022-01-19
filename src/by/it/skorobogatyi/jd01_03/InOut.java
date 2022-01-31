package by.it.skorobogatyi.jd01_03;

public class InOut {

    static double[] getArray(String line) {

        String trimmedLine = line.trim();
        String[] lineElements = trimmedLine.split(" ");
        double[] doublesArray = new double[lineElements.length];

        for (int index = 0; index < doublesArray.length; index++) {
            doublesArray[index] = Double.parseDouble(lineElements[index]);
        }

        return doublesArray;
    }

    static void printArray(double[] array) {

        for (double arrayMember : array) {
            System.out.print(arrayMember + " ");
        }
    }

    static void printArray(double[] array, String name, int columnCount) {

        for (int index = 0; index < array.length; index++) {

            System.out.printf("%s[%- 3d] = %-10.4f", name, index, array[index]);

            if ((index + 1) % columnCount == 0 || index + 1 == array.length) {
                System.out.println();
            }
        }
    }
}

