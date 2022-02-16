package by.it.yushkevich.jd01_11;

import java.util.*;

public class SetC<E> implements Set<E> {

    private List<E> elements = new ListB<E>();


    @Override
    public int size() {

        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.size() == 0;
    }

    @Override
    public boolean contains(Object o) {

        return this.elements.contains(o);
    }

    //////////////////////////////////////
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (!this.elements.contains(e)) {
            this.elements.add(e);
            return true;
        } else
            return false;
    }

    @Override
    public boolean remove(Object o) {
        if (this.elements.contains(o)) {
            int index = this.elements.indexOf(o);
            this.elements.remove(index);
            return true;
        } else

            return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {


        E[] arrayC = (E[]) c.toArray();
        int lengthC = arrayC.length;
        boolean[] isContain = new boolean[lengthC];
        //fill array with true or false, we need all true.
        for (int i = 0; i < lengthC; i++) {
            if (this.contains(arrayC[i])) {
                isContain[i] = true;
            } else isContain[i] = false;
        }

        for (boolean b : isContain) {
            if (!b) {
                return false;

            }
        }

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        Object[] arrayC = c.toArray();
        int lengthC = arrayC.length;

        boolean isAdded = false;

        for (int i = 0; i < arrayC.length; i++) {
            if (!this.elements.contains(arrayC[i])) {
                this.elements.add((E) arrayC[i]);
                isAdded = true;
            }
        }


        return isAdded;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        if (this.containsAll(c)) {
            E[] arrayC = (E[]) c.toArray();
            for (int i = 0; i < arrayC.length; i++) {
                for (int j = 0; j < this.elements.size(); j++) {
                    if (Objects.equals(elements.get(j), arrayC[i])) {
                        this.remove(arrayC[i]);
                    }
                }
            }
            return true;
        }
        return false;
    }


//        boolean isRemoved = false;
//
//        if (this.elements.containsAll(c)) {
//
//            E[] arrayC = (E[]) c.toArray();
//            for (int i = 0; i < arrayC.length; i++) {
//                for (int j = 0; j < this.elements.size(); j++) {
//                    if (arrayC[i].equals(this.elements.get(j))) {
//                        this.elements.remove(arrayC[i]);
//                    }
//
//
//                }
//                isRemoved = true;
//            }
//
//
//        }
//
//
//        return isRemoved;
//    }

    @Override
    public void clear() {
        this.elements.clear();

    }
}
