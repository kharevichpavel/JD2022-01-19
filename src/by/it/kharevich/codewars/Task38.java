package by.it.kharevich.codewars;
/*
Рассмотрите слово "abode". Мы видим, что буква aнаходится в позиции 1и bнаходится в позиции 2. В алфавите aи bтакже находятся в позициях 1и 2. Обратите также внимание на то, что dand ein abodeзанимают позиции, которые они должны были бы занимать в алфавите, а именно позиции 4и 5.

Учитывая массив слов, вернуть массив количества букв, которые занимают свои позиции в алфавите для каждого слова. Например,

solve(["abode","ABc","xyzD"]) = [4, 3, 1]
См. тестовые случаи для большего количества примеров.

Ввод будет состоять из букв алфавита, как в верхнем, так и в нижнем регистре. Нет пробелов.
 */

public class Task38{
    public static int[] solve(String[] arr){
        int[] result = new int[arr.length];
        String[] line = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String[] letter = arr[i].split("");
            for (int j = 0; j < letter.length; j++) {
                for (int k = 0; k < line.length; k++) {
                    if (letter[j].equalsIgnoreCase(line[k]) && j == k) {
                        count++;
                    }
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("%s" ,solve(new String[]{"abode","ABc","xyzD"}));
    }
}
/*
List<Integer> ans = new ArrayList<>();
        for (String s: arr) {
            s = s.toLowerCase();
            int count = 0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == i + 'a') count++;
            ans.add(count);
        }
        return ans.stream().mapToInt( i -> i).toArray();
        */