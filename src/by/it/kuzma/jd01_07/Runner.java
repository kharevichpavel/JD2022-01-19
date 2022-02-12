package by.it.kuzma.jd01_07;

class Runner {
    public static void main(String[] args) {
        Scalar var1 = new Scalar("1234.5678");
        System.out.println(var1);

        Var var2 = new Scalar(2.22);
        System.out.println(var2);

        Var var3 = new Scalar(var1);
        System.out.println(var3);

        System.out.println("-".repeat(40));

        Vector var4 = new Vector(new double[]{1, 2, 3, 4});
        System.out.println(var4);

        Var var5 = new Vector(var4);
        System.out.println(var5);

        Var var6 = new Vector("{1,2,4}");
        System.out.println(var6);

        System.out.println("-".repeat(40));

        Matrix var7 = new Matrix(new double[][]{{1,2}, {3,4}});
        System.out.println(var7);

        Matrix var8 = new Matrix(var7);
        System.out.println(var8);


    }
}
