package a0707;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1을 입력하세요");
        int a = sc.nextInt();
        System.out.println("숫자 2을 입력하세요");
        int b = sc.nextInt();
        cacu(a, b);
    }

    static void cacu(int a1, int b1) {
        if (a1 % b1 == 0) {
            System.err.printf("%d*%d = %d", b1, a1 / b1, a1);
        } else if (b1 % a1 == 0) {
            System.err.printf("%d*%d = %d", a1, b1 / a1, b1);
        } else {
            System.out.println("배수 관계가 아님 none");
        }
    }
}
