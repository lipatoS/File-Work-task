package task1;

import utils.Constants;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    static String fileName;
    static String myFile;
    static FileInputStream fin;
    public void readFile(String fileNames) {
        fileName = fileNames;
        myFile = Constants.RELATIVE_PATH + fileName;

        try {
            fin = new FileInputStream(myFile);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}