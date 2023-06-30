package a0630;

import java.util.Scanner;

public class Exam4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 100) + 1;
        int count = 0;
        while (true) {
            System.out.println("숫자를 맞춰보세요 :)");
            int user_num = scanner.nextInt();
            if (num > user_num) {
                System.out.println("더 큰 수를 입력하세요!");
            } else {
                System.out.println("더 작은 수를 입력하세요!");
            }
            if (num == user_num) {
                System.out.println("축하합니다! 맞추셨어요!");
                System.out.println("정답 : " + num + "시도 횟수 : " + count);
                break;
            }
            count++;
        }

    }
}
