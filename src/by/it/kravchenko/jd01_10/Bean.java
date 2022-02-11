package by.it.kravchenko.jd01_10;

public class Bean {
    @Param(a=10 ,b=20)
    static double sum(int a,int b){
        return (a+b);
    }
    @Param(a=10,b=20)
    static double max(int a, int b){
        return Math.max(a,b);
    }
    @Param(a=10,b=20)
    double min(int a, int b){
        return Math.min(a,b);
    }
    double avg(int a, int b){
        return sum(a,b)/2.0;
    }
}
