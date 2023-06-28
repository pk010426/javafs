package backend.문제_0628;

import java.util.Scanner;

public class Exam4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 하나 입력하세요.");
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0 입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다!");
        }
    }
}
