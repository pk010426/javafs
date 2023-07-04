package a0704;

import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하면 아스키 코드로 변환됩니다!");
        int a = sc.nextLine().charAt(0);
        System.out.println(a);
    }
}
