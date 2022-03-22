package by.it.kharevich.codewars;

public class Task45 {

    public static int countRedBeads(final int nBlue) {
        int countBlue = nBlue;
        int countRed = 0;
        if (countBlue<2){
            countRed=0;
        }else if (countBlue==2){
            countRed=2;
        }else{
            for (int i = 2; i <= nBlue; i++) {
                countRed=countRed+2;
            }
        }
        return countRed;
    }

    public static void main(String[] args) {
        System.out.println(countRedBeads(6));

    }
}
// return n > 0 ? (n - 1) * 2 : 0;