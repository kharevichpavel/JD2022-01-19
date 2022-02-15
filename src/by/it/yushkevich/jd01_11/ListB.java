package by.it.yushkevich.jd01_11;

import java.util.*;

public class ListB<E> implements List<E> {

    private E[] elements = (E[]) new Object[0];
    private int size = 0;


    @Override
    public boolean add(E e) {

        if (elements.length == size) {
            int newCapacity = elements.length + elements.length / 2 + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        elements[size++] = e;

        return true;
    }


    @Override
    public E remove(int index) {

        E removedValue = elements[index];

        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size] = null; // т.к. иначе последний элемент будет хранится в двух ячейках
        size--;


        return removedValue;
    }


    @Override
    public E get(int index) {
        return elements[index];
    }


    @Override
    public E set(int index, E element) {


        E oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }


    @Override
    public void add(int index, E element) {

        if (elements.length == size) {
            int newCapacity = elements.length + (elements.length / 2) + 1;
            elements = Arrays.copyOf(elements, newCapacity);
        }
        System.arraycopy(elements, index, elements, index + 1, size-index);

        elements[index] = element;
        size++;


    }


    @Override
    public boolean addAll(Collection<? extends E> c) {

        Object[] arrayC = c.toArray(); // новый массив
        int lengthC = arrayC.length; // длина нового массива

        if (lengthC > elements.length - size) { //отмнеимаем от длинны размер, смотрел сколько свободных ячеек есть, если новым массив не влазит, то увеличиваем прежний
            int newCapacity = elements.length + elements.length/2+1;
            elements =Arrays.copyOf(elements, newCapacity);
        }

        System.arraycopy(arrayC,0, elements,size, lengthC);
        size = size+lengthC;


        return true;
    }


    @Override
    public String toString() {


        StringJoiner joiner = new StringJoiner(", ", "[", "]");// для склейки строк лучше и быстрее чем стрингбилдер
        for (int i = 0; i < size; i++) {
            if (elements[i] == null) {
                joiner.add("null");
            } else {
                joiner.add(elements[i].toString());
            }
        }
        return joiner.toString();
    }


    @Override
    public int size() {
        return 0;
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
