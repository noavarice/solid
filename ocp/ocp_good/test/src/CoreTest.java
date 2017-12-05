/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author alexrazinkov
 */
public class CoreTest {
    /**
     * Test of connect method, of class Core.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        final Settings s = new Settings();
        final GoodCore instance = new GoodCore(s);
        assert(instance.connect());
    }
    
}
