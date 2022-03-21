package by.it.kharevich.codewars;

import static java.lang.Math.*;

public class Task16 {

    public static long findNextSquare(long sq) {
        long n;
        if (sqrt(sq)== round(sqrt(sq))) n = (long) pow(((long) sqrt(sq) + 1), 2);
        else n = -1;
        return n;
    }
}
