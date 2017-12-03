/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexrazinkov
 */
public class FileReaderTest {

    /**
     * Test of fromFile method, of class FileReader.
     */
    @Test
    public void testFromFile() throws Exception {
        System.out.println("fromFile");
        String filePath = "/home/alexrazinkov/test";
        String expResult = "testtest";
        String result = new String(FileReader.fromFile(filePath));
        assertEquals(expResult, result);
    }
    
}
