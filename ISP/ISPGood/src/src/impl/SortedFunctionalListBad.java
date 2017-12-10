/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import src.IFunctionalCollection;
import src.ISortedFunctionalCollection;

/**
 *
 * @author alexrazinkov
 */
public class SortedFunctionalListBad<T extends Comparable> implements ISortedFunctionalCollection {

    private List<T> l;
    
    public SortedFunctionalListBad() {
        l = new LinkedList<T>();
    }
    
    @Override
    public void addSorted(Comparable item) {
        int pos = 0;
        final int length = l.size();
        while (pos < length && item.compareTo(l.get(pos)) == 1) {
            ++pos;
        }
        
        l.add(pos, (T)item);
    }

    public T get(final int pos) {
        return l.get(pos);
    }
    
    public int size() {
        return l.size();
    }
    
    @Override
    public ISortedFunctionalCollection map(Function f) {
        final SortedFunctionalListBad res = new SortedFunctionalListBad();
        for (final T t: l) {
            res.addSorted((Comparable) f.apply(t));
        }
        
        return res;
    }

    @Override
    public void forEach(Consumer f) {
        l.forEach(f);
    }

    @Override
    public ISortedFunctionalCollection filter(Predicate f) {
        final SortedFunctionalListBad coll = new SortedFunctionalListBad();
        l.stream().filter(f).forEach(t -> coll.addSorted((Comparable) t));
        return coll;
    }
    
}
