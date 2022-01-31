package by.it.tarend.jd01_05;

import java.util.Arrays;

import static java.lang.Math.*;

public class TaskC {
    public static void main(String[] args) {
        solveTask6();
        solveTask7();
    }

    private static void solveTask7() {
        double[] arrayA = new double[31];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (int) (random() * 348 + 103);
        }

        int newLength = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] * 0.1 > i) {
                newLength++;
            }
        }

        double[] arrayB = new double[newLength];
        int j = 0;
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] * 0.1 > i) {
                arrayB[j] = arrayA[i];
                j++;
            }
        }
        Arrays.sort(arrayB);

        printArray(arrayA, "A", 5);
        System.out.println();
        printArray(arrayB, "B", 5);
    }

    private static void solveTask6() {
        int n = (int) (random() * 21 + 20);
        double[] array = new double[n];
        double step = (9.0 - 5.33) / n;
        double z;
        double x = 5.33;
        for (int index = 0; index < array.length ; index++) {
            z = cbrt(x * x + 4.5);
            array[index] = z;
            x += step;
        }
        System.out.println("Массив А");
        printArray(array, "A", 5);
        double[] newArray = createNewArray(n, array);
        System.out.println("Массив B");
        printArray(newArray, "B", 5);
        double geomAvg = сountGeomAvg(newArray);
        System.out.println("Среднее геометрическое элементов массива В = " + geomAvg);


    }

    private static double сountGeomAvg(double[] newArray) {
        double geomAvg;
        double multip = 1;
        for (double element : newArray) {
            multip *= element;
        }
        geomAvg = pow(multip, 1./newArray.length);
        return geomAvg;
    }

    private static double[] createNewArray(int n, double[] array) {
        int n2 = 0; // длина нового массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3.5) {
                n2 = array.length - i;
                break;
            }
        }
        double[] newArray = new double[n2];
        System.arraycopy(array, n - n2, newArray, 0, n2);
        return newArray;
    }

    static void printArray(double[] array, String nameOfArray, int columnCount) {
        for (int index = 0; index < array.length; index++) {
            if (((index+1) % columnCount == 0) || (index+1 == array.length)) {
                System.out.printf("%s[% -3d]=%-12.8f\n", nameOfArray, index, array[index]);
            } else {
                System.out.printf("%s[% -3d]=%-12.8f\t", nameOfArray, index, array[index]);
            }
        }
        System.out.println();
    }
}
