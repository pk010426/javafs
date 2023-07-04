package a0704;

import java.util.Arrays;
import java.util.Scanner;

public class Exam9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d 번째 정수를 입력하세요!%n", i + 1);
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        int min = num[0];
        System.out.println(min);
    }
}
