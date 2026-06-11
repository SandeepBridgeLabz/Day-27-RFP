import java.nio.file.*;
import java.util.stream.Stream;

public class CountEntries {

    public static long count(Path path) throws Exception {

        try(Stream<String> lines =
                    Files.lines(path)) {

            return lines.count();
        }
    }
}