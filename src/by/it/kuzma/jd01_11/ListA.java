package by.it.kuzma.jd01_11;

import java.util.*;

public class ListA<E> implements List<E> {

    @SuppressWarnings("unchecked")
    private E[] element = (E[]) new Object[]{};
    private int size = 0;


    @Override
    public boolean add(E e) {

        if (element.length == size){
            int newCapacity = element.length + (element.length/2) + 1;
            element = Arrays.copyOf(element, newCapacity);
        }
        element[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[","]");
        for (int i = 0; i < size; i++) {
            joiner.add(element[i].toString());

        }
        return joiner.toString();
    }

    @Override
    public E remove(int index) {
        E returnValue = element[index];
        System.arraycopy(element,index+1,element,index,size-index-1);
        element[size--] = null;
        return returnValue;
    }

    @Override
    public E get(int index) {
        return element[index];
    }

    @Override
    public int size() {
        return size;
    }


    //stubs

    @Override
    public void add(int index, E element) {

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
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
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
    public E set(int index, E element) {
        return null;
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
