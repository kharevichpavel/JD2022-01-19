package by.it.yushkevich.jd01_07;

public class Runner {

    public static void main(String[] args) {

        Var var1 = new Scalar(2.42);
        Var var2 = new Scalar("2.32");
        Scalar var3 = (Scalar) var1;
        Var var4 = new Scalar(var3);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);


    }
}
