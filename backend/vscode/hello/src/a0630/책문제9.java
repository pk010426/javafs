package a0630;

import java.util.Scanner;

public class 책문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0;
        int chose = 0;
        int c = 0;
        int[] score = null;
        int high = 0;
        int avg = 0;
        
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------------");
            System.out.println("메뉴를 선택해주세요.");
            chose = sc.nextInt();
            // 학생을 먼저 선택하지 않았을 경우 돌아감
            if (c == 0) {
                if (chose ==2 || chose==3 || chose==4) {
                    System.out.println();
                    System.out.println("학생 수를 먼저 입력해 주세요.");
                    continue;
                }
            } 
            // 학생 선택시 시작.
            if (chose == 1) {
                System.out.println("학생수를 입력해 주세요.");
                students = sc.nextInt();
                System.out.println("현재 입력하신 학생수 : " + students);
                score = new int[students];
                c = 1;
            } else if (chose == 2) {
                System.out.println("학생들의 점수를 입력해 주세요.");
                int n = 0;
                while (true) {
                    System.out.printf("학생 %d의 점수 입력 : ", n + 1);
                    score[n] = sc.nextInt();
                    if (n == students - 1) {
                        System.out.println("점수 입력이 완료되었습니다.");
                        break;
                    }
                    System.out.println(score[0]);
                    n++;
                }
            } else if (chose == 3) {
                System.out.println("학생들의 점수 내역입니다.");
                System.out.println(score[0]);
                for (int i = 0; i < students; i++) {
                    System.out.printf("학생 %d의 점수 : %d%n ", i + 1, score[i]);
                }
            } else if (chose == 4) {
                high = score[0];
                for (int i = 0; i < students; i++) {
                    if (high < score[i]) {
                        high = score[i];
                    }
                    avg = avg + score[i];
                }
                System.out.println("최고점 : " + high);
                System.out.println("평균 : " + avg / students);
            } else if (chose == 5) {
                System.out.println("프로그램을 종료합니다. 감사합니다.");
                break;
            }
        }
    }
}
