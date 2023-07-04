package a0704;

import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1을 입력하세요.");
        int a = sc.nextInt();
        System.out.println("정수 2를 입력하세요.");
        int b = sc.nextInt();

        int c = (a > b) ? a : b;
        System.out.println("더 큰 수는 " + c +" 입니다.");
    }
}
