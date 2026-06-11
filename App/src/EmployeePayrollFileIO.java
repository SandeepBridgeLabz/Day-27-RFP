import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class EmployeePayrollFileIO {

    private static final String PAYROLL_FILE =
            "employee-payroll.txt";

    public void writeData(List<EmployeePayrollData> employees)
            throws IOException {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter(PAYROLL_FILE));

        for (EmployeePayrollData emp : employees) {
            writer.write(emp.toString());
            writer.newLine();
        }

        writer.close();
    }
}