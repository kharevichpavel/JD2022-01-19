package by.it.chaikova.jd01_01;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74

Допускается свободное использование любых методов стандартной библиотеки
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int a1 = sc.nextInt();
        System.out.print("Enter the second number");
        int a2 = sc.nextInt();
        int sum = (a1 + a2);
        System.out.println("DEC:" + (Integer.toString(a1)) + "+" + (Integer.toString(a2)) + "=" + Integer.toString(sum));
        System.out.println("BIN:" + (Integer.toBinaryString(a1)) + "+" + (Integer.toBinaryString(a2)) + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX:" + (Integer.toHexString(a1)) + "+" + (Integer.toHexString(a2)) + "=" + Integer.toHexString(sum));
        System.out.println("OCT:" + (Integer.toOctalString(a1)) + "+" + (Integer.toOctalString(a2)) + "=" + Integer.toOctalString(sum));
    }
}

