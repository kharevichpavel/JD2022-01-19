package by.it.skorobogatyi.jd01_07;

public class Runner {

    public static void main(String[] args) {

        Scalar variableA1 = new Scalar(3.14159);
        System.out.println(variableA1);

        Var variableA2 = new Scalar("2.71828");
        System.out.println(variableA2);

        Var variableA3 = new Scalar(variableA1);
        System.out.println(variableA3);
    }
}
