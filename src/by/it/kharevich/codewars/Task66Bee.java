package by.it.kharevich.codewars;

public class Task66Bee {
    public static int howManyBees(final char[][] hive) {
        int bees = 0;
        for (int i = 0; hive != null && i < hive.length; i++) {
            for (int j = 0; j < hive[i].length; j++) {
                if (hive[i][j] == 'b') {
                    if (i > 1 && hive[i - 1][j] == 'e' && hive[i - 2][j] == 'e') bees++;
                    if (j > 1 && hive[i][j - 1] == 'e' && hive[i][j - 2] == 'e') bees++;
                    if (j < hive[i].length - 2 && hive[i][j + 1] == 'e' && hive[i][j + 2] == 'e') bees++;
                    if (i < hive.length - 2 && hive[i + 1][j] == 'e' && hive[i + 2][j] == 'e') bees++;
                }
            }
        }
        return bees;
    }


    public static void main(String[] args) {
        System.out.println(howManyBees(new char[][]{"bee.bee".toCharArray(), ".e..e..".toCharArray(), ".b..eeb".toCharArray()}));

    }
}
