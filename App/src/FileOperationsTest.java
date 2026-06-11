import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileOperationsTest {

    @Test
    public void givenFile_WhenCreated_ShouldExist() throws Exception {

        File file = new File("test.txt");

        file.createNewFile();

        Assert.assertTrue(file.exists());

        file.delete();
    }
    @Test
    public void givenEmployees_WhenWrittenToFile_ShouldMatchEntries()
            throws Exception {

        List<EmployeePayrollData> employees =
                Arrays.asList(
                        new EmployeePayrollData(1,"Ram",25000),
                        new EmployeePayrollData(2,"Shyam",30000)
                );

        EmployeePayrollFileIO io =
                new EmployeePayrollFileIO();

        io.writeData(employees);

        long count =
                Files.lines(Paths.get("employee-payroll.txt"))
                        .count();

        Assert.assertEquals(2,count);
    }
    @Test
    public void givenPayrollFile_WhenCounted_ShouldReturn2()
            throws Exception {

        long entries =
                PayrollPrinter.countEntries();

        Assert.assertEquals(2, entries);
    }
    @Test
    public void givenPayrollFile_WhenRead_ShouldReturnEmployees()
            throws Exception {

        List<String> data =
                PayrollAnalysis.readData();

        Assert.assertEquals(2, data.size());
    }
}