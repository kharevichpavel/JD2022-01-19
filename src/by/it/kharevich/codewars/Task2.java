package by.it.kharevich.codewars;

public class Task2 {


    public static int sum(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                count = count + arr[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,-2,3,4,5};
        System.out.println(sum(arr));



    }
}
