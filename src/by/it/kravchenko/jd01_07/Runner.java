package by.it.kravchenko.jd01_07;

 class Runner {
    public static void main(String[] args) {
        Var var1 = new Scalar(1.222);
        System.out.println(var1);
        Var var2= new Scalar("24242.2424");
        System.out.println(var2);
        Var var3=new Scalar((Scalar) var2);
        System.out.println(var3);
    }
}
