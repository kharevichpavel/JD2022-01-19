package by.it.kravchenko.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        double[] array = InOut.getArray(string);
        InOut.printArray(array);
        String name = "A";
        int columnCount = 4;
        InOut.printArray(array,name,columnCount);
        Helper.findMin(array);
        Helper.findMax(array);

    }

}
