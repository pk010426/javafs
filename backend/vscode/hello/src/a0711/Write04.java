package a0711;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write04 {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("d:/out.txt");

        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니당.\r\n";
            output.write(data);
        }
        output.close();
        // PrintWriter를 사용할 경우에는 생성자 파라미터로 파일명 대신 추가로 열림 FileWriter에 객체를 전달해야함
        PrintWriter output2 = new PrintWriter(new FileWriter("d:/out.txt", true));

        for (int i = 11; i < 21; i++) {
            String data = i + " 번째 줄입니당.++ \r\n";
            output2.write(data);
        }
        output2.close();

    }
}
