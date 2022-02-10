package by.it.tarend.jd01_10;

public class Bean {

    @Param(a = 1, b = 2)
    static double sum (int first, int second) {
        return first + second;
    }
    @Param(a = 2, b = 4)
    double max (int first, int second) {
        return Math.max(first, second);
    }

    @Param(a = 0, b = 5)
    static double min (int first, int second) {
        return Math.min(first, second);
    }

    double avg (int first, int second) {
        return (first + second) / 2.0;
    }


}
