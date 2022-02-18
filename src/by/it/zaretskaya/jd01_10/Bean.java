package by.it.zaretskaya.jd01_10;

public class Bean {
    @Param(a=2,b=5)
   static double sum(int first,int second){
        return first+second;
    }
    @Param(a=2,b=5)
    static double max(int first,int second){
        return Math.max(first, second);
    }
    @Param(a=2,b=5)
    double min(int first,int second){
        return Math.min(first, second);
    }
    double avg(int first,int second){
        return (first+second)/2d;
    }
}
