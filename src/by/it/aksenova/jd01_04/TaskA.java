package by.it.aksenova.jd01_04;

public class TaskA {
    public static void main(String[] args) {
        printMulTable();
    }
    static void printMulTable(){
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
            }
            System.out.println();
        }

    }
}
