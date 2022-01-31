

package by.it.skorobogatyi.jd01_04;


import java.util.Arrays;

public class TaskC {


    public static void main(String[] args) {

        buildOneDimArray(" 666 7 2 5 5 7 1 12 33 453");
    }

    static void buildOneDimArray(String line) {

        double[] array = InOut.getArray(line);

        InOut.printArray(array, "V", 5);

        double firstElement = array[0];
        double lastElement = array[array.length - 1];

        mergeSort(array);

        InOut.printArray(array, "V", 4);

        int indexFirst = binarySearch(array, firstElement);
        int indexLast = binarySearch(array, lastElement);

        System.out.printf("Index of first element=%d%n", indexFirst);
        System.out.printf("Index of last element=%d%n", indexLast);
    }

    static void mergeSort(double[] arrayForSort) {

        double[] result = getPart(arrayForSort, 0, arrayForSort.length - 1);
        System.arraycopy(result, 0, arrayForSort, 0, arrayForSort.length);
    }

    static double[] getPart(double[] array, int left, int right) {

        double[] result;

        if (array.length > 1) {
            int medial = right / 2;

            double[] leftPart = Arrays.copyOfRange(array, 0, medial);
            double[] rightPart = Arrays.copyOfRange(array, medial, array.length);

            result = merge(getPart(leftPart, left, leftPart.length), getPart(rightPart, leftPart.length, array.length));

        } else {
            result = array;
        }
        return result;
    }

    static double[] merge(double[] part1, double[] part2) {

        double[] result = new double[part1.length + part2.length];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < result.length; i++) {

            if (leftIndex < part1.length && rightIndex < part2.length) {

                if (part1[leftIndex] < part2[rightIndex]) {
                    result[i] = part1[leftIndex];
                    leftIndex++;

                } else {
                    result[i] = part2[rightIndex];
                    rightIndex++;
                }

            } else {
                if (leftIndex == part1.length) {
                    result[i] = part2[rightIndex];
                    rightIndex++;

                } else {
                    if (rightIndex == part2.length) {
                        result[i] = part1[leftIndex];
                        leftIndex++;

                    } else {
                        break;
                    }
                }
            }
        }

        return result;
    }

    static int binarySearch(double[] array, double value) {

        int leftBorder = 0;
        int rightBorder = array.length - 1;

        int returnValue = -1;

        while (leftBorder <= rightBorder) {
            int medial = (leftBorder + rightBorder) / 2;

            if (array[medial] == value) {
                returnValue = medial;
                break;

            } else {
                if (array[medial] > value) {
                    rightBorder = medial - 1;
                } else {
                    leftBorder = medial + 1;
                }
            }
        }
        return returnValue;
    }
}


