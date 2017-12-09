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
public class CustomThread extends Thread {
    private void doSomething() {
        System.out.println("hello");
    }
    
    public CustomThread(Runnable r) {
        super(r);
    }
    
    @Override
    public void run() {
        doSomething();
    }
}
