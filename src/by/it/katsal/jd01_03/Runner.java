package by.it.katsal.jd01_03;


public class Runner {
    public static void main(String[] args) {
        String line = "1 2 5 9 3 12 10";
        double[] array = InOut.getArray(line);
        System.out.println("Simple output\n");
        InOut.printArray(array) ;
        String name = "V";
        int columnCout = 5;
        System.out.println("Output with columns number\n");
        InOut.printArray(array , name , columnCout ) ;
        Helper.sort(array);
        System.out.println("Output with columns number after sorting");
        InOut.printArray(array , name , 3 ) ;
    }
}
