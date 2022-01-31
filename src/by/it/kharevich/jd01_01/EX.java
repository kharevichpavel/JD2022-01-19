package by.it.kharevich.jd01_01;

import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        double getWeight;


        getWeight();
    }

    private static double getWeight() {
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        double m = 3.86;
        double z = 9.81;
        double marsweight =(weight*(m/z));
        System.out.println(getWeight());
        return marsweight;
    }
}


 /*
        System.out.println(getWeight());
    }

    public static double getWeight() {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextInt();
        double m = 3.86;
        double z = 9.81;
        double marsweight =(weight*(m/z));

        return marsweight;
    }
}
*/