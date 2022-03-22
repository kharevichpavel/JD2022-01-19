package by.it.kharevich.codewars;

public class Task36 {

    public static String makeComplement(String dna) {
        String[] line = dna.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("A")){
                line[i]="T";
            }else if (line[i].equals("T")){
                line[i]="A";
            }else if (line[i].equals("C")){
                line[i]="G";
            }else if (line[i].equals("G")){
                line[i]="C";
            }
            result.append(line[i]);
        }
        return String.valueOf(result);
    }
}
