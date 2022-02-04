package by.it.kuzma.jd01_03;

public class Runner {
    public static void main(String[] args) {
        String line = " 26 10 28 3 93 -256";
        double[] array = InOut.getArray(line);
        InOut.printArray(array);
        String name = "V";
        int columnCount = 4;
        InOut.printArray(array, name, columnCount);

        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);
    }
}
