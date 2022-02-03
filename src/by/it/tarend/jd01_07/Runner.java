package by.it.tarend.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var var1 = new Scalar(1.111);
        Var var2 = new Scalar("23.11");
        Var var3 = new Scalar((Scalar) var1);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        Var var4 = new Vector(new double[]{1, 1, 1 , 1});
        System.out.println(var4);
        Var var5 = new Vector((Vector) var4);
        System.out.println(var5);
        Var var6 = new Vector("{1,3,4}");
        System.out.println(var6);
    }
}
