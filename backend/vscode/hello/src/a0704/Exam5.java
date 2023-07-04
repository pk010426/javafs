package a0704;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 1을 입력하세요.");
        int a = sc.nextInt();
        System.out.println("정수 2를 입력하세요.");
        int b = sc.nextInt();
        System.out.println("정수 3을 입력하세요.");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("합 : " + sum);
        System.out.println("평균 : " + sum / (float) 3);
    }
}
