package by.it.aksenova.jd01_03;

public class Runner {
    public static void main(String[] args) {
        String line = " 11 22 33 66 99 0 123 -9";
        double[] array = InOut.getArray(line);
        System.out.println("\nSimple output");
        InOut.print(array);
        String name = "V";
        int columnCount = 5;
        System.out.println("\nOutput with columns number");
        InOut.print(array, name, columnCount);
        Helper.sort(array);

    }
}