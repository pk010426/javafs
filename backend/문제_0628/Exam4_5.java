package backend.문제_0628;

import java.util.Scanner;

public class Exam4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int score = 0;
        char grade = ' ', opt = ' ';
        System.out.println("점수를 입력하세요.");
        int score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }

        System.out.printf("당신의 학점은 %c%c입니다. %n", grade, opt);
    }
}
