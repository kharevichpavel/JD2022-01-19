package by.it.kharevich.jd01_11;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListB <T> implements List <T> {
    @SuppressWarnings("unchecked")
    private T[] elements=(T[]) new Object[0];

    private int size = 0;

    @Override
    public String toString() {
        StringJoiner maker = new StringJoiner(", ","[","]");
        for (int i = 0; i < size; i++) {
            maker.add(elements[i].toString());
        }
        return maker.toString();
    }

    @Override
    public boolean add(T e) {
        if(elements.length==size){
            int newCapacity = (elements.length+(elements.length/2)+1);
            elements = Arrays.copyOf(elements,newCapacity);
        }
        elements[size++]=e;
        return true;
    }

    @Override
    public T remove(int index) {
        T returnValue = elements[index];
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        elements[size--]=null;
        return returnValue;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T set(int index, T element) {

        T returnValue = elements[index];
        elements[index]=element;
        System.arraycopy(elements,index,elements,index,size);
        elements[size++]=element;


        return returnValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int position = 0;
            @Override
            public boolean hasNext() {
                return position<size;
            }

            @Override
            public T next() {
                return elements[position++];
            }
        };
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
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
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
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
