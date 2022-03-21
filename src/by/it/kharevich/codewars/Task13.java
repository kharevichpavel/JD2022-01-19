package by.it.kharevich.codewars;

public class Task13 {

    public static int[] reverse(int n){
        int[] array = new int[n];
        array[0] = n;
        for (int i = 0; i < array.length; i++) {
            array[i] =n--;

        }
        return array;
    }
}
