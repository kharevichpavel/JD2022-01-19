package by.it.kharevich.codewars;



public class Task56MultiplicativePersistence {

    public static void main(String[] args) {
        System.out.println(persistence(39));
    }

    public static int persistence(long n) {
        long m = 1;
        long r = n;
        if (r / 10 == 0)
            return 0;
        for (r = n; r != 0; r /= 10)
            m *= r % 10;
        return persistence(m) + 1;
    }
}
