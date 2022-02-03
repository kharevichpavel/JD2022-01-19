package by.it.yushkevich.jd01_06;

import java.util.Random;

public class TaskC2 {

    public static void main(String[] args) {
        String text = Poem.text;


        long timeSlow1 = System.nanoTime();
        slow(text);
        long timeSlow2 = System.nanoTime();
        long slowTime = timeSlow2-timeSlow1;

        long timeFast1 = System.nanoTime();
        fast(text);
        long timeFast2 = System.nanoTime();
        long fastTime = timeFast2-timeFast1;

        System.out.println(slowTime);
        System.out.println("-".repeat(50));
        System.out.println(fastTime);



    }


    private static String slow(String text){
        String[] array = text.split("[^а-яА-яёЁ]+");
        Random random = new Random(1);
        String slowMessage = "";
        while (slowMessage.length()<100000){

            slowMessage = slowMessage+array[random.nextInt(array.length)]+" ";
        }

        // System.out.println(slowMessage);
        System.out.println(slowMessage);
        return slowMessage;
    }

    private static String fast(String text){
        String[] array = text.split("[^а-яА-яёЁ]+");
        Random random = new Random(1);
        StringBuilder fastMessage = new StringBuilder("");
        while (fastMessage.length()<100000){
                //string x = x.append(" ").append(array[i]); //добавляем к нашей пустой строке рандомное слово из массива через апенд  и так же прробел пробел
            // пока слово не станет 100000 символов, то к нему будет добавляться рандомные слова и пробелы
            fastMessage = fastMessage.append(array[random.nextInt(array.length)]).append(" ");

        }
        System.out.println(fastMessage);
        return fastMessage.toString();
    }


}
