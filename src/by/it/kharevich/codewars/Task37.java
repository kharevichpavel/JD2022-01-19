package by.it.kharevich.codewars;
// Треугольное число
public class Task37 {

    public static int sumTriangularNumbers(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = (int) (result+0.5*i*(i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(34));

    }
}
