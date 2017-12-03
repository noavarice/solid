/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 * @author alexrazinkov
 */
public class FileReader {
    public static byte[] fromFile(final String filePath) throws IOException {
        final byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return Arrays.copyOf(bytes, bytes.length - 1);
    }
}
