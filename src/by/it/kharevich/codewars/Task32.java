package by.it.kharevich.codewars;

public class Task32 {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int year = 0;
        while (principal<desired){
            year++;
            principal+= (principal*interest)-(principal*tax*interest);
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.01625,0.18,1200));

    }
}
