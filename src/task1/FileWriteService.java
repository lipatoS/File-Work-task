package task1;

import utils.Constants;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public String handleFile(String myText, String fileName) {
        try {
            FileOutputStream fout =
                    new FileOutputStream(Constants.RELATIVE_PATH + fileName);
            byte[] byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            fout.close();
        } catch (IOException ex) {
            return ex.getMessage();
        }
        return "file created!";
    }
}
