/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author alexrazinkov
 */
public interface IFunctionalCollection<T> {

    <R> IFunctionalCollection<R> map(final Function<T, R> f);
    
    <T> IFunctionalCollection<T> filter(final Predicate<T> f);
    
    void forEach(final Consumer<T> f);
}
