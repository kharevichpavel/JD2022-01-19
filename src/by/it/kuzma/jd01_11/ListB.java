package by.it.kuzma.jd01_11;

import java.util.*;

public class ListB<E> implements List<E> {

    @SuppressWarnings("unchecked")
    private E[] elements = (E[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(E e) {
        if (elements.length == size){
            int newCapacity = elements.length + elements.length/2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ","[","]" );
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                stringJoiner.add("null");
            } else {
                stringJoiner.add(elements[i].toString());
            }

        }
        return stringJoiner.toString();
    }

    @Override
    public E remove(int index) {
        E returnElement = elements[index];
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        elements[size--] = null;
        return returnElement;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }


    @Override
    public E set(int index, E element) {
        E returnValue = elements[index];
        elements[index] = element;
        return returnValue;
    }

    @Override
    public void add(int index, E element) {
        elements = Arrays.copyOf(elements, elements.length+1);
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {

        if (c.toArray().length == 0){return false;}

        if (elements.length + c.size() > size){
            int newCapacity = elements.length + c.size()+1;
            elements = Arrays.copyOf(elements, newCapacity);
            System.arraycopy(c.toArray(),0,elements,size,c.size());
            size += c.size();
            return true;
        }
        System.arraycopy(c.toArray(),0,elements,size,c.size());
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    //stubs
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
