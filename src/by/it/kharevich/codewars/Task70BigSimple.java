package by.it.kharevich.codewars;

import java.math.BigInteger;

public class Task70BigSimple {

    public static int solve(int [] arr){
        int result = 0;
        for (int i = 2; i < arr.length; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime(i);
            if (probablePrime){
                System.out.println(i);
                result+=arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));

    }
}

/*
public static int solve(int [] arr){
         int sum=0;
        for (int i = 2; i < arr.length; i++) {
            if(BigInteger.valueOf(i).isProbablePrime(i))
                sum+= arr[i];
        }
        return sum;
    }
 */