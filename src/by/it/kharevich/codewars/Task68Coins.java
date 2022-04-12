package by.it.kharevich.codewars;


public class Task68Coins {
    public static String[] coin(int n) {
        String[] possibilities = new String[(int) Math.pow(2, n)];

        for (int i = 0; i < possibilities.length; i++) {
            String binary = Integer.toBinaryString(i);
            binary = binary.replace('0', 'H');
            binary = binary.replace('1', 'T');
            while (binary.length() < n) {
                binary = "H" + binary;
            }
            possibilities[i] = binary;
        }
        for (int i = 0; i < possibilities.length; i++) {
            System.out.println(possibilities[i]);

        }


        return possibilities;
    }

    public static void main(String[] args) {

        System.out.println(coin(5));

    }
}
