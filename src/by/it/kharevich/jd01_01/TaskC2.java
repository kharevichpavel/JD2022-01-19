package by.it.kharevich.jd01_01;

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
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt();
        int result=a + b;
        System.out.println("DEC:" + a + "+" + b + "=" + result);{

            String convert1 = Integer.toBinaryString(a);
            String convert2 = Integer.toBinaryString(b);
            String convert3 = Integer.toBinaryString(result);
            System.out.println("BIN:" + convert1 + "+" + convert2 + "=" + convert3);{

                convert1 = Integer.toHexString(a);
                convert2 = Integer.toHexString(b);
                convert3 = Integer.toHexString(result);
                System.out.println("HEX:" + convert1 + "+" + convert2 + "=" + convert3);{

                    convert1 = Integer.toOctalString(a);
                    convert2 = Integer.toOctalString(b);
                    convert3 = Integer.toOctalString(result);
                    System.out.println("OCT:" + convert1 + "+" + convert2 + "=" + convert3);
                }
            }
        }

    }


}
