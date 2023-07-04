package a0704;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ys;
        String ms;
        String ds;

        System.out.println("연도를 입력하세요.");
        int y = sc.nextInt();
        if (y < 1000) {
            ys = "0" + (Integer.toString(y));
        } else {
            ys = (Integer.toString(y));
        }

        System.out.println("월을 입력하세요.");
        int m = sc.nextInt();
        if (m < 10) {
            ms = "0" + (Integer.toString(m));
        } else {
            ms = (Integer.toString(m));
        }

        System.out.println("일을 입력하세요.");
        int d = sc.nextInt();
        if (m < 10) {
            ds = "0" + (Integer.toString(d));
        } else {
            ds = (Integer.toString(d));
        }
        System.out.printf("%s, %s, %s", ys, ms, ds);
    }
}
