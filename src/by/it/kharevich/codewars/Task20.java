package by.it.kharevich.codewars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task20 {

    public static List filterList(final List list) {
        List result = new ArrayList<>();
        for (Object o : list) {
            if (! (o instanceof String)){
                result.add(o);
            }
        }
        return result;
    }
}
