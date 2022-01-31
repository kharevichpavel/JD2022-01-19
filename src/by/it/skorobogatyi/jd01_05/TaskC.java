package by.it.skorobogatyi.jd01_05;

import java.util.Random;

public class TaskC {

    static int columnWidth = 11;

    public static void main(String[] args) {

        step1();
        step2();
    }


    private static void step1() {

        Random random = new Random();
        int elementsNumberInFirstArray = random.nextInt(20, 41);
        double[] firstArray = new double[elementsNumberInFirstArray];

        double delta = (9 - 5.33) / (elementsNumberInFirstArray - 1);

        for (int i = 0; i < elementsNumberInFirstArray; i++) {
            firstArray[i] = Math.pow(Math.pow((5.33 + delta * i), 2) + 4.5, 1 / 3.);
        }

        int columnCount = 5;
        String firstArrayName = "A";

        printArray(firstArray, firstArrayName, columnCount);

        int elementsNumberInSecondArray = 0;
        for (double value : firstArray) {
            if (value > 3.5) {
                elementsNumberInSecondArray++;
            }
        }

        double[] secondArray = new double[elementsNumberInSecondArray];

        for (int i = 0, counter = 0; i < firstArray.length; i++) {
            if (firstArray[i] > 3.5) {
                secondArray[counter] = firstArray[i];
                counter++;
            }
        }

        String secondArrayName = "B";
        printArray(secondArray, secondArrayName, columnCount);

        double product = 1;
        for (double value : secondArray) {
            product *= value;
        }

        System.out.printf("Среднее геометрическое чисел в массиве В = %f%n", Math.pow(product, 1. / elementsNumberInSecondArray));
    }

    private static void step2() {

        Random random = new Random();
        int x = 31;
        int[] arrayA = new int[x];
        String arrayAName = "A";

        int leftBorder = 103;
        int rightBorder = 451;

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(leftBorder, rightBorder);
        }

        int arrayBLength = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] * 0.1 > i) {
                arrayBLength++;
            }
        }

        int[] arrayB = new int[arrayBLength];
        String arrayBName = "B";

        int arrayBIndex = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] * 0.1 > i) {
                arrayB[arrayBIndex] = arrayA[i];
                arrayBIndex++;
            }
        }

        int maxColumnNumber = 5;

        int lineCountForArrayA = getLineCountForArray(arrayA, maxColumnNumber);
        int columnCountForArrayA = getColumnCountForArray(arrayA, lineCountForArrayA);

        int lineCountForArrayB = getLineCountForArray(arrayB, maxColumnNumber);
        int columnCountForArrayB = getColumnCountForArray(arrayB, lineCountForArrayB);

        printArrayWithBordersHorizontal(arrayA, arrayAName, columnCountForArrayA, lineCountForArrayA);

        printArrayWithBordersVertical(arrayB, arrayBName, columnCountForArrayB, lineCountForArrayB);

    }


    static void printArray(double[] array, String name, int columnCount) {

        for (int index = 0; index < array.length; index++) {
            System.out.printf("%s[%- 3d]=%-10.6f", name, index, array[index]);
            if ((index + 1) % columnCount == 0 || index + 1 == array.length) {
                System.out.println();
            }
        }
        System.out.println("-".repeat(40));
    }

    private static int getColumnCountForArray(int[] array, int lineCount) {

        return (int) Math.ceil((double) array.length / lineCount);
    }

    private static int getLineCountForArray(int[] array, int maxColumnNumber) {

        return (int) Math.ceil((double) array.length / maxColumnNumber);
    }

    private static void printArrayWithBordersHorizontal(int[] arrayA, String name, int columnCount, int lineCount) {
        generateUpperBorder(columnCount);
        int index = 0;
        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < columnCount; j++) {

                if (index < arrayA.length) {
                    System.out.printf("║ %s[%2d]=%3d ", name, index, arrayA[index]);

                } else {
                    System.out.print("║" + " ".repeat(columnWidth));
                }
                index++;

                if (index % columnCount == 0) {
                    System.out.println("║");
                }
            }
            if (i != columnCount + 1) {
                generateInnerLine(columnCount);
            } else break;
        }
        generateLowerBorder(columnCount);
    }

    private static void generateUpperBorder(int columnCount) {

        System.out.print("╔");
        for (int i = 0; i < columnCount - 1; i++) {
            for (int j = 0; j < columnWidth; j++) {
                System.out.print("═");
            }
            System.out.print("╦");
        }
        for (int i = 0; i < columnWidth; i++) {
            System.out.print("═");
        }
        System.out.println("╗");
    }

    private static void generateLowerBorder(int columnCount) {

        System.out.print("╚");
        for (int i = 0; i < columnCount - 1; i++) {
            for (int j = 0; j < columnWidth; j++) {
                System.out.print("═");
            }
            System.out.print("╩");
        }
        for (int i = 0; i < columnWidth; i++) {
            System.out.print("═");
        }
        System.out.println("╝");
    }

    private static void generateInnerLine(int columnCount) {

        System.out.print("╠");
        for (int i = 0; i < columnCount - 1; i++) {
            for (int j = 0; j < columnWidth; j++) {
                System.out.print("═");
            }
            System.out.print("╬");
        }
        for (int i = 0; i < columnWidth; i++) {
            System.out.print("═");
        }
        System.out.println("╣");
    }

    private static void printArrayWithBordersVertical(int[] arrayB, String name, int columnCount, int lineCount) {

        generateUpperBorder(columnCount);

        for (int i = 0; i < lineCount; i++) {
            int index = i;
            for (int j = 0; j < columnCount; j++) {

                if (index >= arrayB.length) {
                    System.out.print("║" + " ".repeat(columnWidth));

                } else {
                    System.out.printf("║ %s[%2d]=%3d ", name, index, arrayB[index]);
                    index += lineCount;
                }

                if (j == columnCount - 1) {
                    System.out.println("║");
                }
            }
            if (i < lineCount - 1) {
                generateInnerLine(columnCount);
            }
        }
        generateLowerBorder(columnCount);
    }
}


