package File;

import Check.CheckInput;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void createFile(String[] data) throws IOException {
        String s= ParseData.getNameFile();
        try {
            File f = new File(s);
            CheckInput.checkInput(data);
            if (f.createNewFile()) {
               // System.out.println("File created");
                WriteFile.write(data);
            } else {
                WriteFile.write(data);
                //System.out.println("File already exists");
            }
        }
        catch (IOException | InputDataFormatException e) {
            System.out.println("Запись в файл не удалась");
        }
    }
}