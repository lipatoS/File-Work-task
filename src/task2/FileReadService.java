package task2;

import utils.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadService {
    static Path path;
    public void readFile(String fileName) {
        path = Path.of(Constants.RELATIVE_PATH + fileName);
        try {
            String text = Files.readString(path);
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}