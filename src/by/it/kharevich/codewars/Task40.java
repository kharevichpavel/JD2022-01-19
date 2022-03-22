package by.it.kharevich.codewars;

public class Task40 {

    public static boolean getXO (String str) {
        boolean answer = false;
        String[] line = str.toLowerCase().split("");
        int countX = 0, countO = 0;
        for (int i = 0; i < line.length; i++) {
            switch (line[i]){
                case "x":
                    countX++;
                    break;
                case "o":
                    countO++;
                    break;
            }
            if (countX!=countO){
                answer = false;
            }else if (countX==countO){
                answer = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(getXO("zssooxxddd"));

    }
}

/*
str = str.toLowerCase();
return str.replace("o","").length() == str.replace("x","").length();
 */
