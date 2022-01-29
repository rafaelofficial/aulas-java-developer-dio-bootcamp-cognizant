package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();
    // esta pasta temporária será executada antes de rodar o teste abaixo

    @Test
    public void shouldCreateNewFileInTemporaryFolder()  throws IOException {
        File createFile = temporaryFolder.newFile("in.txt");

        assertTrue(createFile.isFile());
        assertEquals(temporaryFolder.getRoot(), createFile.getParentFile());
    }
}
