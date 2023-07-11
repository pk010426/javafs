package a0711;

import java.io.IOException;
import java.io.InputStream;

public class Sample01_1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a = in.read();
        System.out.println(a);
    }
}
