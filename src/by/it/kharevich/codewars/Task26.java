package by.it.kharevich.codewars;

public class Task26 {

    public static int factorial(int n) {
        int fact = 1;
        if (n>0 & n<=12){
            for (int i = 1; i <= n; i++) {
                fact =fact*i;
            }
        }else if (n<0 | n>12){
            throw new IllegalArgumentException();
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));

    }
}
