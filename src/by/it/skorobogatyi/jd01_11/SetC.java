package by.it.skorobogatyi.jd01_11;

import java.util.*;
/*
size(), +
isEmpty(), +
contains(Object o), +
add(T e), +
remove(Object o), +
addAll(List<?> c), +
containsAll(Collection<?> c),
removeAll(Collection<?> c) */

public class SetC<E> implements Set<E> {

    private E[] elements = (E[]) new Object[16];
    private int size = 0;

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        for (int i = 0; i < size; i++) {
            string.append(elements[i]);
            if (i + 1 < size) {
                string.append(", ");
            }
        }
        string.append("]");
        return string.toString();
    }

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
                if (this.elements[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (this.elements[i] == null) {
                    continue;
                }
                if (this.elements[i].equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(E e) {

        if (this.contains(e)) {
            return false;
        }

        if (size == elements.length) {
            int newLength = elements.length + elements.length / 2 + 1;
            elements = Arrays.copyOf(elements, newLength);
        }
        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (this.contains(o)) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == o) {
                    System.arraycopy(elements, i + 1, elements, i, elements.length - i - 1);
                    elements[size--] = null;
                }
            }
            return true;
        }
        return false;

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        E[] forComparison = (E[]) c.toArray();
        boolean shouldReturn = false;
        for (E e : forComparison) {
            if (this.contains(e)) {
                continue;
            } else {
                this.add(e);
                shouldReturn = true;
            }
        }
        return shouldReturn;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        E[] forComparison = (E[]) c.toArray();
        boolean[] booleans = new boolean[forComparison.length];
        for (int i = 0; i < forComparison.length; i++) {
            if (this.contains(forComparison[i])) {
                booleans[i] = true;
            }
        }

        for (boolean aBoolean : booleans) {
            if (!aBoolean) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (this.containsAll(c)) {
            E[] forDeleting = (E[]) c.toArray();
            for (int i = 0; i < forDeleting.length; i++) {
                for (int j = 0; j < size; j++) {
                    if (Objects.equals(elements[j], forDeleting[i])) {
                        this.remove(forDeleting[i]);
                        size--;
                    }
                }
            }
            return true;
        }
        return false;
    }

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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        this.size = 0;
    }
}