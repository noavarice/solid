/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author alexrazinkov
 */
public interface ISortedFunctionalCollection<T extends Comparable> {

    void addSorted(final T item);
    
    <R extends Comparable> ISortedFunctionalCollection<R> map(final Function<T, R> f);
    
    ISortedFunctionalCollection<T> filter(final Predicate<T> f);
    
    void forEach(final Consumer<T> f);
}
