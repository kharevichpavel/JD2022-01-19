package by.it.chaikova.jd01_07;


 class Runner {
    public static void main(String[] args) {
        Scalar var1 = new Scalar("1245.56");
        System.out.println(var1);
        Var var2 = new Scalar(12.5);
        System.out.println(var2);
        Var var3 = new Scalar(var1);
        System.out.println(var3);
Var var4=new Vector(new double[]{1,2,5,6});
        System.out.println(var4);
    }
}
