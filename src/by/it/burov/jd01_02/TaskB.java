package by.it.burov.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        step1();
        System.out.println("Ввести номер месяца!");
        int month = scan.nextInt();
        step2(month);
        System.out.println("Ввести параметры квадратного уравнения!");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        step3(a,b,c);

    }
    static void step1(){
        for(int i=1; i<=25; i++){
            System.out.print(i + " ");
            if (i%5 == 0){
                System.out.println();
            }
        }
    }
    static void step2(int month){
        switch (month){
            case 1:{
                System.out.println("январь");
                break;
            }
            case 2:{
                System.out.println("февраль");
                break;
            }
            case 3:{
                System.out.println("март");
                break;
            }
            case 4:{
                System.out.println("апрель");
                break;
            }
            case 5:{
                System.out.println("май");
                break;
            }
            case 6:{
                System.out.println("июнь");
                break;
            }
            case 7:{
                System.out.println("июль");
                break;
            }
            case 8:{
                System.out.println("август");
                break;
            }
            case 9:{
                System.out.println("сентябрь");
                break;
            }
            case 10:{
                System.out.println("октябрь");
                break;
            }
            case 11:{
                System.out.println("ноябрь");
                break;
            }
            case 12:{
                System.out.println("декабрь");
                break;
            } default: {
                System.out.println("нет такого месяца");
            }
        }

    }
    static void step3(double a, double b, double c){
        double discriminant = Math.pow(b,2) - 4*a*c;
        double sqrt = Math.sqrt(discriminant);
        if (discriminant > 0){
            double x1 = ((-b) + sqrt)/(2 * a);
            double x2 = ((-b) - sqrt)/(2 * a);
            System.out.println(x1 + " " + x2);
        }else if(discriminant==0){
            double x1= -(b/(2*a));
            System.out.println(x1);
        }else {
            System.out.println("корней нет");
        }
    }
}
