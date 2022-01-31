package by.it.skorobogatyi.jd01_05;

public class TaskB {

    public static void main(String[] args) {

        step1();
        System.out.println("-".repeat(50));
        step2();
    }

    private static void step1() {

        for (double a = 0; a <= 2; a += 0.2) {
            double sum = 0;
            for (int x = 1; x <= 6; x++) {
                sum += Math.pow(7, a) - Math.cos(x);
            }
            System.out.printf("При a = %3.2f сумма = %g%n", a, sum);
        }
    }

    private static void step2() {

        for (double x = -6; x < 2; x += 0.5) {

            String string = null;
            double beta = 0;

            if (-2 < x/2 && x/2 <= -1) {
                beta = Math.sin(x * x);

            } else if (-1 < x/2 && x/2 < 0.2) {
                beta = Math.cos(x * x);

            } else if (x/2 == 0.2) {
                beta = 1 / Math.tan(x * x);

            } else {
                string = "вычисления не проводятся";
            }

            if (string == null) {

                double alpha = Math.log10(Math.abs(beta + 2.74));
                System.out.printf("При x/2=%+4.2f a = %f%n", x / 2, alpha);

            } else {
                System.out.printf("При x/2=%+4.2f %s%n", x / 2, string);
            }
        }
    }
}
