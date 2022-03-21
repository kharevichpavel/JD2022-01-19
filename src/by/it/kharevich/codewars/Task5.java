package by.it.kharevich.codewars;

public class Task5 {

    public static int squareSum(int[] n){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            n[i]=(int) Math.pow(n[i],2);
            count = count +  n[i]++;

        }
        return count;
    }
}
