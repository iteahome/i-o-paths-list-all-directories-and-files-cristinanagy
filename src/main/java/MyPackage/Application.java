package MyPackage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String [] args) throws IOException {

        Path path = Paths.get("C:","Users");
        List<Path> allDirAndFiles = Files.list(path).collect(Collectors.toList());

        System.out.println("content: ");

        for(Path p: allDirAndFiles) {
            System.out.println(p.getFileName() + ", ");
        }
        System.out.println("-----");
    }
}
