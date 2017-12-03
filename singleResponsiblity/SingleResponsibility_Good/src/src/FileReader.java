/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author alexrazinkov
 */
public class FileReader {
    public static String fromFile(final String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
