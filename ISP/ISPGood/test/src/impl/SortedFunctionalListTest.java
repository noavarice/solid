/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexrazinkov
 */
public class SortedFunctionalListTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of addSorted method, of class SortedFunctionalList.
     */
    @Test
    public void testAddSorted() {
        System.out.println("addSorted");
        final List<Integer> ints = new ArrayList<Integer>() {
            {
                add(2);
                add(2);
                add(5);
                add(6);
                add(53);
            }
        };
        
        SortedFunctionalList l = new SortedFunctionalList();
        for (final int i: ints) {
            l.addSorted(i);
        }
        
        for (int i = 0; i < ints.size(); ++i) {
            assertEquals(ints.get(i), l.get(i));
        }
    }

    /**
     * Test of map method, of class SortedFunctionalList.
     */
    @Test
    public void testMap() {
        System.out.println("map");
        final List<Integer> ints = new ArrayList<Integer>() {
            {
                add(2);
                add(2);
                add(5);
                add(6);
                add(53);
            }
        };
        
        final Function<Integer, Integer> f = i -> (int)i * 10;
        final List<Integer> res = ints.stream().map(f).collect(Collectors.toList());
        SortedFunctionalList l = new SortedFunctionalList();
        for (final int i: ints) {
            l.addSorted(i);
        }
        
        l = (SortedFunctionalList)(l.map(f));
        
        for (int i = 0; i < ints.size(); ++i) {
            assertEquals(res.get(i), l.get(i));
        }
    }

    /**
     * Test of filter method, of class SortedFunctionalList.
     */
    @Test
    public void testFilter() {
        System.out.println("filter");
        final List<Integer> ints = new ArrayList<Integer>() {
            {
                add(2);
                add(2);
                add(5);
                add(6);
                add(53);
            }
        };
        
        final Predicate<Integer> f = i -> (int)i > 10;
        final List<Integer> res = ints.stream().filter(f).collect(Collectors.toList());
        SortedFunctionalList l = new SortedFunctionalList();
        for (final int i: ints) {
            l.addSorted(i);
        }
        
        l = (SortedFunctionalList)(l.filter(f));
        for (int i = 0; i < res.size(); ++i) {
            assertEquals(res.get(i), l.get(i));
        }
    }

    /**
     * Test of forEach method, of class SortedFunctionalList.
     */
    @Test
    public void testForEach() {
        System.out.println("forEach");
        final List<Integer> ints = new ArrayList<Integer>() {
            {
                add(2);
                add(2);
                add(5);
                add(6);
                add(53);
            }
        };
        
        SortedFunctionalList l = new SortedFunctionalList();
        for (final int i: ints) {
            l.addSorted(i);
        }
        
        AtomicInteger counter = new AtomicInteger(0);
        final Consumer<Integer> f = i -> counter.set(counter.get() + 1);
        l.forEach(f);
        assertEquals(counter.get(), ints.size());
    }
    
}
