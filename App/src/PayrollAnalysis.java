import java.nio.file.*;
import java.util.List;

public class PayrollAnalysis {

    public static List<String> readData()
            throws Exception {

        return Files.readAllLines(
                Paths.get("employee-payroll.txt"));
    }
}