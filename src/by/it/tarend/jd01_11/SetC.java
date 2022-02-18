package by.it.tarend.jd01_11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetC<E> implements Set<E> {

    @SuppressWarnings("unchecked")
    private E[] elements = (E[]) new Object[16];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    continue;
                }
                if (elements[i].equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < size;
            }

            @Override
            public E next() {
                return elements[position++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        return newArray;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (this.contains(e)) {
            return false;
        }
        if (size >= elements.length * 3 / 4) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == o) {
                    System.arraycopy(elements, i+1, elements, i, size - i - 1);
                    elements[size--] = null;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        @SuppressWarnings("unchecked")
        E[] entryArray = (E[]) c.toArray();
        boolean[] isContain = new boolean[entryArray.length];
        for (int i = 0; i < entryArray.length; i++) {
            if (this.contains(entryArray[i])) {
                isContain[i] = true;
            }
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
        @SuppressWarnings("unchecked")
        E[] editionArray = (E[]) c.toArray();
        boolean isAdd = false;
        for (E element : editionArray) {
            if (!this.contains(element)) {
                this.add(element);
                isAdd = true;
            }
        }
        return isAdd;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (this.containsAll(c)) {
            @SuppressWarnings("unchecked")
            E[] removeArray = (E[]) c.toArray();
            for (E e : removeArray) {
                this.remove(e);
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder outPut = new StringBuilder("[");
        String delimiter = "";
        for (int i = 0; i < size; i++) {
            outPut.append(delimiter).append(elements[i]);
            delimiter = ", ";
        }
        outPut.append("]");
        return outPut.toString();
    }

    @Override
    public void clear() {
        this.removeAll(this);

    }
}
