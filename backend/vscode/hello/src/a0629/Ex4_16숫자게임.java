package a0629;

import java.util.Scanner;

public class Ex4_16숫자게임 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = (int) (Math.random() * 100) + 1, user_num = 0;

        do {
            System.out.println("숫자를 맞춰보세요!");
            user_num = scanner.nextInt();
            if (num > user_num) {
                System.out.println("당신의 숫자는 더 커야 합니다!");
            } else {
                System.out.println("당신의 숫자는 더 작아야 합니다.");
            }
        } while (num != user_num);
        System.out.println("맞췄습니다! " + "정답 : " + num);
    }
}
