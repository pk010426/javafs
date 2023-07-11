package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write01_1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/cat.txt");
        // byte 단위로 표기되기 때문에 숫자자체는 못 씀. 대신 string으로 바꿔서는 가능
        int a = 53;

        String c = Integer.toString(a);
        String b = "고양이";

        output.write(Integer.toString(a).getBytes());
        output.write(b.getBytes());

        output.close();
    }
}