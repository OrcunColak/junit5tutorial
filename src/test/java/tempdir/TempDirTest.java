package tempdir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDirTest {

    // Can be used across multiple tests in the class
    @TempDir
    static Path sharedTempDir;

    @Test
    void testFileProcessing(@TempDir Path tempDir) throws IOException {
        Path testFile = tempDir.resolve("test.txt");
        Files.write(testFile, "test content".getBytes());

        // Your file processing logic
        // ...
        // The temporary directory and its contents are automatically deleted after the test
    }
}
