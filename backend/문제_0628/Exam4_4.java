package backend.문제_0628;

import java.util.Scanner;

public class Exam4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int score = 0;
        char grade = ' ';
        System.out.println("점수를 입력하세요.");
        int score = scanner.nextInt();
        // 96
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("당신은 %c 등급입니다.", grade);
    }
}
