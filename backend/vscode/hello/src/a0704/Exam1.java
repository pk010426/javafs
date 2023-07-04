package a0704;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 1을 입력해 주세요.");
        char a = sc.nextLine().charAt(0);
        System.out.print("문자 2를 입력해 주세요.");
        char b = sc.nextLine().charAt(0);
        System.out.printf("입력된 문자 : %c, %c", b, a);
    }
}
