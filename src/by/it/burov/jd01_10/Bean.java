package by.it.burov.jd01_10;

public class Bean {

    @Param(a=5,b=8)
    static double sum(int first, int second){
        return first+second;
    }
    @Param(a=4,b=2)
    static double max(int first, int second){
        return Math.max(first,second);
    }
    @Param(a=4,b=3)
    double min(int first, int second){
        return Math.min(first,second);
    }

    double avg (int first, int second){
        return (first+second)/2d;
    }
}
