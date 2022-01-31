package by.it.skorobogatyi.jd01_01;

import java.util.Scanner;


class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        
        String aBin = Integer.toBinaryString(a);
        String bBin = Integer.toBinaryString(b);
        String sumBin = Integer.toBinaryString(sum);

        String aHex = Integer.toHexString(a);
        String bHex = Integer.toHexString(b);
        String sumHex = Integer.toHexString(sum);

        String aOct = Integer.toOctalString(a);
        String bOct = Integer.toOctalString(b);
        String sumOct = Integer.toOctalString(sum);

        System.out.println("DEC:" + a + "+" + b + "=" + sum);
        System.out.println("BIN:" + aBin + "+" + bBin + "=" + sumBin);
        System.out.println("HEX:" + aHex + "+" + bHex + "=" + sumHex);
        System.out.println("OCT:" + aOct + "+" + bOct + "=" + sumOct);
    }


}
