package a0707;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        calculator calculator = new calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 1을 입력하세요");
        int a = sc.nextInt();
        System.out.println("숫자 2을 입력하세요");
        int b = sc.nextInt();
        calculator.cal(a, b);
    }
}

