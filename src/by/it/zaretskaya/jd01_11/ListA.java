package by.it.zaretskaya.jd01_11;

import java.util.*;

public class ListA<E> implements List<E> {
@SuppressWarnings("unchecked")
private E[] elements= (E[]) new Object[]{};
private int size=0;

    @Override
    public boolean add(E e) {
        if (elements.length==size){
            int newCapacity = elements.length + (elements.length>>1)+1;
            elements = Arrays.copyOf(elements,newCapacity);
        }
        elements [size++]=e;
        return true;
    }

    @Override
    public E remove(int index) {
        //check size and throw IOOB
        E returnValue=elements [index];
        System.arraycopy(elements,index+1,elements,index,size-index-1);
        elements [size--]= null;
        return returnValue;
    }

    @Override
    public E get(int index) {
        return elements[index];
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
    public int size() {
        return 0;
    }
     //stubs
    @Override
    public boolean isEmpty() {
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
    public void add(int index, E element) {

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
