package a0711;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write01_2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/cat1.txt");
        // byte 단위로 표기되기 때문에 숫자자체는 못 씀. 대신 string으로 바꿔서는 가능
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        output.write(a.getBytes());

        output.close();
    }
}
