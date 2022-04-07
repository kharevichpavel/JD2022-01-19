package by.it.kharevich.codewars;

public class Task58WordsSort {

    public static String order(String words) {
        String[] line = words.split(" ");
        String[] result = new String[line.length];
        for (String s : line) {
            if (s.contains("1")) {
                result[0] = s;
            } else if (s.contains("2")) {
                result[1] = s;
            } else if (s.contains("3")) {
                result[2] = s;
            } else if (s.contains("4")) {
                result[3] = s;
            } else if (s.contains("5")) {
                result[4] = s;
            } else if (s.contains("6")) {
                result[5] = s;
            } else if (s.contains("7")) {
                result[6] = s;
            } else if (s.contains("8")) {
                result[7] = s;
            } else if (s.contains("9")) {
                result[8] = s;
            }else{
                return "";
            }
        }
        return String.join(" ",result);
    }

    public static void main(String[] args) {
        System.out.println(order("Empty input should return empty string"));

    }
}

/*
 public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
 */


/*
public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }
 */