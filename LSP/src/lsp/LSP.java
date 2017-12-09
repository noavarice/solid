/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;

import java.util.concurrent.FutureTask;
import src.CustomThread;

/**
 *
 * @author alexrazinkov
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Runnable r = () -> System.out.println("world");
        new CustomThread(r).run();
        new Thread(r).run();
    }
    
}
