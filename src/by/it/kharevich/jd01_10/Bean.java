package by.it.kharevich.jd01_10;

public class Bean {

    double sum(int first, int second) {
        return first + second;
    }

    @Param(a = 2, b = 5)
    static double max(int first, int second) {
        return Math.max(first, second);
    }

    @Param(a = 2, b = 5)
    static double min(int first, int second) {
        return Math.min(first, second);
    }

    @Param(a = 2, b = 5)
    double avg(int first, int second) {
        return sum(first, second) / 2.0;
    }
}
