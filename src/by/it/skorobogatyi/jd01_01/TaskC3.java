package by.it.skorobogatyi.jd01_01;

import java.util.Scanner;


class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight: ");
        int earthWeight = sc.nextInt();

        double marsWeightDouble = TaskC3.getWeight(earthWeight);

        System.out.println(marsWeightDouble);
    }

    public static double getWeight(int weight){
        double marsWeightRaw = weight / 9.81 * 3.86;

        int marsWeightInt = (int) marsWeightRaw;

        double restFromSubtraction = marsWeightRaw - marsWeightInt;
        double restFromSubtractionX100 = restFromSubtraction * 100;

        if (restFromSubtractionX100 % 1 >= 0.5) {
            restFromSubtraction += 0.01;
        }

        int restFromSubtractionIntX100 = (int) (restFromSubtraction * 100);
        double lastTwoDigits = (double) restFromSubtractionIntX100 / 100;

        return marsWeightInt + lastTwoDigits;
    }

}
