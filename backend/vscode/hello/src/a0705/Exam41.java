package a0705;

import java.util.Scanner;

public class Exam41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("슬기가 공을 몇 m 던졌는지 입력하세요.");
        int n = sc.nextInt();
        if ((n >= 30 && n <= 40) || (n >= 60 && n <= 70)) {
            System.out.printf("공이 %dm에 들어왔으므로, 슬기 승 WIN!", n);
        } else {
            System.out.println("30m~40m 또는 60m~70m가 아니므로, 슬피 패 LOSE!");
        }
    }
}
