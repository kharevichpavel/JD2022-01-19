package by.it.tarend.jd01_01;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1.  Метод getWeight(int weight) должен быть статическим.
2.  Метод getWeight должен возвращать значение типа double.
3.  Метод getWeight должен ОБЯЗАТЕЛЬНО округлять до сотых возвращаемое значение
    типа double внутри самого метода.
4.  Метод getWeight не должен ничего выводить на экран.
5.  Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.
6.  Если получится, то пока не используйте в getWeight методы стандартной библиотеки
    (round, ceil, printf, format, и т.п). Возможностей самого языка вполне достаточно.

Пример:

Ввод:
75

Вывод:
29.51

*/
class TaskC3 {
    static double gE = 9.81;
    static double gM = 3.86;


    public static void main(String[] args) {
        int weightE;
        double weightM;
        Scanner scan = new Scanner(System.in);

        weightE = scan.nextInt();
        weightM = getWeight(weightE);

        System.out.println(weightM);
    }
    public static double getWeight(int weightE) {
        double weightM;
        int weightInt;

        weightM = weightE / gE * gM;
        weightInt = (int) (weightM * 1000);
        if (weightInt % 10 >= 5) {
            weightInt /= 10;
            weightM = weightInt / 100.00 + 0.01;
        } else {
            weightInt /= 10;
            weightM = weightInt / 100.00;
        }

        return weightM;
    }
}
