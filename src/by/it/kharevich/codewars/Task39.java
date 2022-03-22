package by.it.kharevich.codewars;

public class Task39 {

    public static String autoMorphic(int number){
        int num = (int) Math.pow(number,2);
        String sqNumber = Integer.toString(num);
        String lNumber = Integer.toString(number);
        if (sqNumber.contains(lNumber)){
            return "Automorphic";
        }else{
            return "Not!!";
        }
    }

    public static void main(String[] args) {
        System.out.println(autoMorphic(625));

    }
}
