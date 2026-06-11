import java.nio.file.*;

public class DirectoryWatchService {

    public static void main(String[] args) throws Exception {

        Path path = Paths.get("PayrollDirectory");

        WatchService watchService =
                FileSystems.getDefault().newWatchService();

        path.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY
        );

        while(true) {

            WatchKey key = watchService.take();

            for(WatchEvent<?> event : key.pollEvents()) {
                System.out.println(event.kind() +
                        " -> " + event.context());
            }

            key.reset();
        }
    }
}