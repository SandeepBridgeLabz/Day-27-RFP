import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        System.out.println("Exists: " + file.exists());

        file.createNewFile();

        System.out.println("After Creation: " + file.exists());

        file.delete();

        System.out.println("After Delete: " + file.exists());

        File dir = new File("PayrollDirectory");

        if(dir.mkdir()) {
            System.out.println("Directory Created");
        }

        File emptyFile = new File("PayrollDirectory/employee.txt");
        emptyFile.createNewFile();

        File[] files = dir.listFiles();

        for(File f : files) {
            System.out.println(f.getName());
        }
    }
}