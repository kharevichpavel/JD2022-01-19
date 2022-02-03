package by.it.yushkevich.jd01_03;

public class Runner {

    public static void main(String[] args) {
        String line = " 1 2 3 55 -99 12.3 23 53 2 3 2 4 ";
        double[] array = InOut.getArray(line);// если метод стадичный, то вызываем его так. пишем класс. ставим точку .
// если метод не стат, то нужно обязательно создавть экземпляр класса и потом вызывать метод
       // System.out.println(Arrays.toString(array));

        InOut.printArray(array);

        String name = "Mas";
        int columnCount = 5;

        InOut.printArray(array, name, columnCount);


        double max = Helper.findMax(array);
        double min = Helper.findMin(array);
        Helper.sort(array);
        System.out.println(max+" "+min);

        System.out.println("массив послле пузырьковой сортировки");
        InOut.printArray(array);








    }

}
