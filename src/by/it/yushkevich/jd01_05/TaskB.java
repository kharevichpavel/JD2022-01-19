package by.it.yushkevich.jd01_05;

import static java.lang.Math.*;

public class TaskB {

    public static void main(String[] args) {
        sumCount();
        partTwo();
    }

    private static void partTwo() {

        double b = 0;

        System.out.println("    X        B          A");
        System.out.println("-".repeat(35));

        for (double x = -5.5; x < 2; x += 0.5) {

            if ((x / 2) <= -2 || (x / 2) > 0.2) {

                System.out.printf("При x/2=%.3f Вычисленияне определены\n", x / 2);


            } else {
                if ((x / 2) > -2 && (x / 2) <= -1) {

                    b = sin(pow(x, 2));


                } else if ((x / 2) > -1 && (x / 2) < 0.2) {

                    b = cos(pow(x, 2));


                } else if (x / 2 == 0.2) {

                    b = 1 / tan(pow(x, 2));


                }

                double a = log10(abs(b + 2.74));
                System.out.printf("При х/2 =%4.2f  а = %-6.6f\n", x / 2, a);


            }
        }

        System.out.println("-".repeat(35));

    }


    private static void sumCount() {

        double y = 0;
        for (double a = 0; a <= 2; a = a + 0.2) {

            for (int x = 1; x <= 6; x++) {

                y = y + (pow(7, a) - cos(x));

            }

            System.out.printf("При а = %f, y = %f\n", a, y);

        }

    }


}
