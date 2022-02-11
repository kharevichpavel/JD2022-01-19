package by.it.kharevich.jd01_10;


import java.lang.reflect.Method;

public class BeanTester {

    public static void main(String[] args) throws Exception {

        Class<Bean>  structureBean = Bean.class;


        Method[] declaredMethods = structureBean.getDeclaredMethods();



                StringBuilder printResult = new StringBuilder();
        for (Method method : declaredMethods) {


            printResult.append("Провверка метода: ").append(method.getName()).append("\n");
            printResult.append("Для ").append(method.getName()).append(" ожидается ").append("???").append("\n");
        }
        System.out.println(printResult);

    }
}
