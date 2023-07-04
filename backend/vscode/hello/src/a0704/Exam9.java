package a0704;

import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d 번째 정수를 입력하세요!%n", i + 1);
            num[i] = sc.nextInt();
        }

        int a = num[0];
        int b = num[0];

        for (int j = 0; j < num.length; j++) {
            if (a > num[j]) {
                a = num[j];
            }
            if (b < num[j]) {
                b = num[j];
            }
        }

        System.out.println("가장 작은 수는 : " + a);
        System.out.println("가장 큰 수는 : " + b);
    }
}
