package Model;

import java.util.*;
import static java.util.Arrays.asList;

public class ListaDeDesejos<E> extends AbstractList<E> implements List<E> {

    ArrayList<E> listaDeDesejos = new ArrayList<E>();

    @Override
    public boolean add(E e) {
        return listaDeDesejos.add(e);
    }

    @Override
    public E get(int index) {
        return (E) listaDeDesejos.get(index);
    }


    @Override
    public void add(int index, E element) {
        listaDeDesejos.add(index, element);
    }

    @Override
    public E remove(int index) {
        return (E) listaDeDesejos.remove(index);
    }

    @Override
    public void clear() {
        listaDeDesejos.clear();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return listaDeDesejos.addAll(index, c);
    }


    @Override
    public int size() {
        return listaDeDesejos.size();
    }

    @Override
    public String toString() {
        return
                "ListaDeDesejos=" + listaDeDesejos
                ;
    }
}
