package by.it.kharevich.codewars;

public class Task31 {

    public static boolean validatePin(String pin) {
        boolean result;
        if (pin.length()==6 | pin.length()==4 & pin.matches("[0-9]+")){
            result = true;
        }else{
            result = false;
        }
        return result;
        // return pin.matches("[0-9]{4}|[0-9]{6}");
    }
}
