package by.it.kharevich.codewars;

public class Task1 {
    public static void main(String[] args) {
        double[] array = new double[]{};
        double count = 0;
        for (double v : array) {
            count = count + v;
            if (count == 0) {
                System.out.println(0);
            }
        }
        System.out.println(count);
    }
}
