package by.it.skorobogatyi.jd01_11;

import java.util.*;


public class ListA<E> implements List<E> {

    private E[] elements = (E[]) new Object[16];
    private int size = 0;

    @Override
    public boolean add(E e) {
        if (elements.length == size) {
            int newLength = elements.length + elements.length / 2 + 1;
            elements = Arrays.copyOf(elements, newLength);
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(elements[i].toString());
        }
        return joiner.toString();
    }

    @Override
    public E remove(int index) {
        E returnElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size--] = null;
        return returnElement;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }


    /// stubbed
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
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public E[] toArray(Object[] a) {
        return null;
    }
}
