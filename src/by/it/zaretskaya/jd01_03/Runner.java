package by.it.zaretskaya.jd01_03;

public class Runner {
    public static void main(String[] args) {
        String line="11 22 33 66 99 0 123 -9";
        double[] array = by.it.zaretskaya.jd01_03.InOut.getArray(line);
        System.out.println("\nSimple output");
        by.it.zaretskaya.jd01_03.InOut.printArray (array);
        String name="V";
        int columCount = 5;
        System.out.println("Output columns number");
        by.it.zaretskaya.jd01_03.InOut.printArray(array,name,columCount);
        Helper.sort (array);
        System.out.println("Output columns number after sorting");
        by.it.zaretskaya.jd01_03.InOut.printArray(array,name,columCount);
        System.out.println("findMin");
        by.it.zaretskaya.jd01_03.InOut.printArray(array);
        System.out.println("findMax");
        by.it.zaretskaya.jd01_03.InOut.printArray(array);

    }


    }

