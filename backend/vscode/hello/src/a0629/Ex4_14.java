package a0629;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.printf("숫자를 입력하세요(ex)12345)%n");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp); // 문자를 정수로 변환
        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);
            num /= 10;
        }
        System.out.printf("각 자릿수의 합은 %d 입니다.%n", sum);
    }
}
