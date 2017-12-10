/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispgood;

import src.impl.SortedFunctionalList;
import src.impl.SortedFunctionalListBad;

/**
 *
 * @author alexrazinkov
 */
public class ISPGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Good");
        final SortedFunctionalList<Integer> good = new SortedFunctionalList<Integer>();
        good.addSorted(5);
        good.addSorted(2);
        good.addSorted(4);
        good.addSorted(6);
        for (int i = 0; i < good.size(); i++) {
            System.out.println(good.get(i));
        }
        
        good.map(i -> (int)i * 10).filter(i -> (int)i < 33).forEach(System.out::println);
        
        System.out.println("Bad");
        final SortedFunctionalListBad<Integer> bad = new SortedFunctionalListBad<Integer>();
        bad.addSorted(5);
        bad.addSorted(2);
        bad.addSorted(4);
        bad.addSorted(6);
        for (int i = 0; i < bad.size(); i++) {
            System.out.println(bad.get(i));
        }
        
        bad.map(i -> (int)i * 10).filter(i -> (int)i < 33).forEach(System.out::println);
    }
}
