package a0711;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Write03 {
    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("d:/ou t.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니당.\r\n";
            output.write(data);
        }
        output.close();

        FileWriter output2 = new FileWriter("d:/ou t.txt", true);

        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄입니당+추가된거.\r\n";
            output2.write(data);
        }
        output2.close();
    }
}