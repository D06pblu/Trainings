package jigsaw;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileSystem fs = FileSystems.getFileSystem(URI.create("jrt:/"));
        Stream<Path> modules = Files.list(fs.getPath("modules")); //стрим всех модулей
        modules.forEach(System.out::println);

        byte[] bytes = Files.readAllBytes(fs.getPath(
                "modules", "java.base", "java/lang/Object.class")); //массив байтов файла Object.class

    }
}
