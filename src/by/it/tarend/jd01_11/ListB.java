package by.it.tarend.jd01_11;

import java.util.*;

public class ListB<E> implements List<E> {
    @SuppressWarnings("unchecked")
    private E[] elements = (E[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(E e) {
        if (elements.length == size) {
            int newCapacity = elements.length * 3 / 2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public E remove(int index) {
        E delElement = elements[index];
        System.arraycopy(elements, index+1, elements, index, size - index - 1);
        elements[size] = null;
        size--;
        return delElement;
    }


    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        E delElement = elements[index];
        elements[index] = element;
        return delElement;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        @SuppressWarnings("unchecked")
        E[] newElements = (E[]) c.toArray();
        if ((size+newElements.length) >= elements.length) {
            int newCapacity = (size + newElements.length) * 3 / 2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        System.arraycopy(newElements, 0, elements, size , newElements.length);
        size += newElements.length;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (size+1 >= elements.length) {
            int newCapacity = elements.length * 3 / 2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = element;
        size++;
    }

    @Override
    public int indexOf(Object o) {
        if (o==null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
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
    public int size() {
        return size;
    }

    // stub

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E>  iterator() {

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
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index > -1) {
            remove(index);
        }
        return index>-1;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
