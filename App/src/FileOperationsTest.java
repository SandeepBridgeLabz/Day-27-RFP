import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class FileOperationsTest {

    @Test
    public void givenFile_WhenCreated_ShouldExist() throws Exception {

        File file = new File("test.txt");

        file.createNewFile();

        Assert.assertTrue(file.exists());

        file.delete();
    }
}