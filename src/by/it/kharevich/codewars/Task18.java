package by.it.kharevich.codewars;

/*Получив строку, сделайте заглавными буквы, которые занимают четные и нечетные индексы отдельно, и верните, как показано ниже. Индекс 0будет считаться четным.
Например, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. См. тестовые случаи для большего количества примеров.
Ввод будет строчной строкой без пробелов.
*/

public class Task18 {

    public static String[] capitalize(String s){
        String u = s.toUpperCase();
        String o = "";
        String t = "";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                o += u.charAt(i);
                t += s.charAt(i);
            }else{
                o += s.charAt(i);
                t += u.charAt(i);
            }
        }
        return new String[]{o, t};
    }

    public static void main(String[] args) {
        for (int i = 0; i < capitalize("ghgjjdk").length; i++) {
            System.out.printf("%s  ", capitalize("ghgjjdk")[i]);

        }

    }
}
