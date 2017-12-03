/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.PrintStream;

/**
 *
 * @author alexrazinkov
 */
public class Streamer {
    
    public static void toStream(final PrintStream s, final String content) {
        s.append(content);
    }
}
