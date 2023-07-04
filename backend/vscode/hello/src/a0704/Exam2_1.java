package a0704;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exam2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수 하나를 입력하세요");
        float a = sc.nextFloat();
        DecimalFormat df = new DecimalFormat("#.##");
        String round = df.format(a);
        System.out.println(round);
    }
}
