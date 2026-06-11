import java.nio.file.*;

public class PayrollPrinter {

    public static void printData() throws Exception {

        Files.lines(Paths.get("employee-payroll.txt"))
                .forEach(System.out::println);
    }
    public static long countEntries() throws Exception {

        return Files.lines(
                        Paths.get("employee-payroll.txt"))
                .count();
    }
}