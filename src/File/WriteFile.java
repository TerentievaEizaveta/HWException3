package File;

import Data.ParseData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void write(String [] data) throws IOException {
        String s= ParseData.getNameFile();
        FileWriter writer = new FileWriter(s, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        for (int i = 0; i < data.length; i++) {
            String text=data[i];
            bufferWriter.write(text+" ");
        }
        bufferWriter.write("\n");
        bufferWriter.close();
    }
}