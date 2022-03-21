package by.it.kharevich.codewars;

public class Task21 {

    public static boolean isSquare(int n) {
        boolean result;
        if (Math.sqrt(n)==Math.round(Math.sqrt(n))){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
