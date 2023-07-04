package a0704;

import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        System.out.println("정사각형의 한 변의 길이를 '정수'로 입력하세요.");
        l = sc.nextInt();
        if (l <= 0) {
            System.out.println("한 변의 길이는 0이하가 될 수 없습니다!");
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
