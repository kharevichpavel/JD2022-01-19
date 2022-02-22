package by.it.tarend.jd01_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TaskA1 {

    public static final int MAX_COUNT = 30;
    public static final int MAX_GRADE = 10;
    private List<Integer> grades = new ArrayList<>();


    public static void main(String[] args) {
        Random random = new Random();
        TaskA1 object = new TaskA1();
        int n = MAX_COUNT/2 + random.nextInt(MAX_COUNT/2  + 1); // количество оценок от 15 до 30
        for (int i = 0; i < n; i++) {
            int grade = random.nextInt(MAX_GRADE + 1);
            object.grades.add(grade);
        }
        System.out.println(object.grades);
        object.clearBad(object.grades);
        System.out.println(object.grades);
    }

    @SuppressWarnings("Java8CollectionRemoveIf") // погасили ворнинг на счет замены итератора на метод ремувИф
    private void clearBad(List<Integer> grades) {
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()) { // можно заменить на grades.removeIf(grade -> grade < 4); - метод коллекции с итератором внутри
            Integer grade = iterator.next();
            if (grade < 4) {
                iterator.remove();
            }
        }

    }
}
