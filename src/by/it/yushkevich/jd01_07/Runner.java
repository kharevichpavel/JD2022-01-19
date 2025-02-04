package by.it.yushkevich.jd01_07;
 class Runner {

    public static void main(String[] args) {

        Var var1 = new Scalar(2.42);
        Var var2 = new Scalar("2.32");
        Scalar var3 = (Scalar) var1;
        Var var4 = new Scalar(var3);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);


        Var varVector = new Vector(new double[]{1, 2, 3, 4});
        System.out.println(varVector);

        Var varVector1 = new Vector((Vector) varVector);
        System.out.println(varVector1);


        Var stringVector = new Vector("{1.2, 2.3, 4,5}");
        System.out.println(stringVector);

        double[][] testArray = {{1, 2, 3}, {6, 3, 4}};//stub
        Var matrixArr1 = new Matrix(testArray);
        System.out.println(matrixArr1);

        Var matrixArr2 = new Matrix((Matrix) matrixArr1);
        System.out.println(matrixArr2);

        Var matrixArr3 = new Matrix("{{ 1.0, 2.0 },{ 3.0, 4.0 },{ 1.0, 2.0 },{ 3.0, 4.0 },{ 1.0, 2.0 },{ 3.0, 4.0 }}");
        System.out.println(matrixArr3);


    }
}
