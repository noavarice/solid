/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.io.OutputStream;


/**
 *
 * @author alexrazinkov
 */
public class Streamer {
    
    public static void toStream(final OutputStream s, final byte[] content) throws IOException {
        s.write(content);
    }
}
