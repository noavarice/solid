/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
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
    public void testFromFile_Works() throws Exception {
        System.out.println("fromFile_works");
        String filePath = "/home/alexrazinkov/test";
        String expResult = "testtest";
        String result = new String(FileReader.fromFile(filePath));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFromFile_Fails() {
        System.out.println("fromFile_fails");
        String filePath = "/home/alexrazinkov/test1"; // not exists
        try {
            String result = new String(FileReader.fromFile(filePath));
        } catch (IOException e) {
            return;
        }
        
        fail("Cannot read from non-existing file");
    }
    
}
