package com.teste;

import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    public void alouldCreateNewFileInTemporaryFolder() throws IOException{
        File created = tmpFolder.newFile("file.txt");
        assertTrue(created.isFile());
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
