package task2;

import utils.Constants;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteService {
    static Path newFile;

    public void createFile(String fileName, String myText) {
        try {
            newFile = Files.createFile(Path.of(Constants.RELATIVE_PATH + fileName));
            Files.writeString(newFile, myText);
            System.out.println("file created!");
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
