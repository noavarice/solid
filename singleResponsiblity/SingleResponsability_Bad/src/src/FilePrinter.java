/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 * @author alexrazinkov
 */
public class FilePrinter {
    public static void printFile(final String filePath) throws IOException {
        System.out.print(new String(Files.readAllBytes(Paths.get(filePath))));
    }
}
