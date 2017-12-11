/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexrazinkov
 */
public class CustomThreadTest {

    /**
     * Checks that CustomThread::run does exactly the same that does Runnable
     * passed to thread constructor
     */
    @Test
    public void testRun() {
        System.out.println("run");
        final AtomicInteger i = new AtomicInteger(0);
        final Runnable r = () -> i.set(i.get());
        new CustomThread(r).run();
        assertEquals(i.get(), 1);
    }
    
}
