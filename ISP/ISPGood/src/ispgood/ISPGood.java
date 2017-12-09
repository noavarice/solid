/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispgood;

import src.impl.SortedFunctionalList;

/**
 *
 * @author alexrazinkov
 */
public class ISPGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final SortedFunctionalList<Integer> l = new SortedFunctionalList<Integer>();
        l.addSorted(5);
        l.addSorted(2);
        l.addSorted(4);
        l.addSorted(6);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        
        l.map(i -> (int)i * 10).filter(i -> (int)i < 33).forEach(System.out::println);
    }
    
}
