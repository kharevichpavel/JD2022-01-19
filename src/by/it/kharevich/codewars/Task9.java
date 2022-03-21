package by.it.kharevich.codewars;

public class Task9 {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        boolean answer;
        if (distanceToPump/mpg<=fuelLeft){
            answer=true;
        }else {
            answer=false;
        }
        return answer;
    }
}
