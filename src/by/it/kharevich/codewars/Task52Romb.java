package by.it.kharevich.codewars;

public class Task52Romb {
    public static String print(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 2 == 0 || n < 1) return null;
        for (int i = 1; i <= n; i+=2) {
            result.append(" ".repeat((n-i)/2) + "*".repeat(i) + "\n");
        }
        for (int i = n-2; i > 0; i-=2) {
            result.append(" ".repeat((n-i)/2) + "*".repeat(i) + "\n");
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(print(5));

    }
}
// ** *** * *** ***