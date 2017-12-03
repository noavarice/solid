/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleresponsibility_good;

import java.io.IOException;
import java.io.PrintStream;
import src.FileReader;
import src.Streamer;

/**
 *
 * @author alexrazinkov
 */
public class SingleResponsibility_Good {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(System.out);
        final String filePath = "/home/alexrazinkov/.zshrc";
        Streamer.toStream(ps, FileReader.fromFile(filePath));
    }
    
}
