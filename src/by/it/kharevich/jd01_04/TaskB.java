package by.it.kharevich.jd01_04;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int peopleCount = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        name = name.trim();
        String[] nameAll = name.split(" ");


        Scanner sc2 = new Scanner(System.in);


        int[][] salary = new int[peopleCount][4];
        int count = 0;
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary[0].length; j++) {
                if (i==0){
                    System.out.printf("Введите зарплату для %s\n",nameAll);
                    salary[i][j] = sc2.nextInt();
                    break;
                }
                else {
                    for (int k = 0; k < nameAll.length; k++) {
                        salary[i][j] = sc2.nextInt();
                        System.out.printf("Введите зарплату для %s\n",nameAll);
                        break;

                    }

                }


            }
        }
    }
}



  /*      for (int i = 0; i < salary.length; i++) {
            System.out.printf("Введите зарплату для %s\n",nameAll);
            salary = sc2.nextInt();



            }*/

/*    private static void namePay(int[][] salary, String[] nameAll) {
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < nameAll.length; j++) {
                System.out.printf("Введите зарплату для %s",nameAll);

            }

            }
    }*/


