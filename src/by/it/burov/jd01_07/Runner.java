package by.it.burov.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var var1 = new Scalar(2.22);
        System.out.println(var1);
        Var var2 = new Scalar("2.25");
        System.out.println(var2);
        Scalar var3a = (Scalar) var1;
        Var var3 = new Scalar(var3a);
        System.out.println(var3);
        Var var4 = new Vector(new double[]{10, 16, 3, 56});
        System.out.println(var4);
        Vector var5a= (Vector) var4;
        Var var5 = new Vector(var5a);
        System.out.println(var5);
        Var var6 = new Vector("{1.0, 2.0, 4.0}");
        System.out.println(var6);
        Var var7=new Matrix(new double[][]{{ 10, 15, 22}, {36, 5,5.1}});
        System.out.println(var7);
        Var var8= new Matrix((Matrix) var7);
        System.out.println(var8);
    }
}
