package by.it.burov.jd01_11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetC<E> implements Set<E> {

    private List<E> elements = new ListB<E>();

    @Override
    public boolean add(E element) {
        if (!this.elements.contains(element)) {
            this.elements.add(element);
            return true;
        } else {
            return false;
        }
    }

    private boolean hasDuplicates(E element) {
        for (E current : this.elements) {
            if (current.equals(element)) return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return this.elements.contains(o);
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public boolean addAll(Collection<? extends E> source) {
        boolean isAnyAdded = false;
        final Collection<E> castedSource = (Collection<E>) source;
        for (E sourceObj : castedSource) {
            if (!this.elements.contains(sourceObj)) {
                this.elements.add(sourceObj);
                isAnyAdded = true;
            }
        }
        return isAnyAdded;
    }

    /*private List<E> removeDuplicates(Collection<E> source) {
        List<E> listToAdd = new ArrayList<>();
        for (E sourceObj : source) {
            if (!hasDuplicates(sourceObj)) listToAdd.add(sourceObj);
        }
        return listToAdd;
    }*/


    @Override
    public String toString() {
        return this.elements.toString() + ")";
    }


    @Override
    public Iterator<E> iterator() {
        return this.elements.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.elements.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.elements.containsAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.elements.removeAll(c);
    }

    @Override
    public void clear() {
        this.elements.clear();
    }
}
