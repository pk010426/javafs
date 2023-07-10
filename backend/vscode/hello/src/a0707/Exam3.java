package a0707;

import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        int[] menu = { 400, 340, 170, 100, 70 };
        String[] menuName = { "치즈버거", "야채버거", "우유", "계란말이", "샐러드" };

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번재 메뉴의 번호를 입력하세요.");
        int m1 = sc.nextInt() - 1;
        System.out.println("두 번재 메뉴의 번호를 입력하세요.");
        int m2 = sc.nextInt() - 1;
        if (menu[m1] + menu[m2] > 500) {
            System.out.println("선택한 메뉴 : " + menuName[m1] + " & " + menuName[m2]);
            System.out.println("angry 500칼로리 넘어서 못먹음   ");
        } else {
            System.out.println("선택한 메뉴 : " + menuName[m1] + " & " + menuName[m2]);
            System.out.println("NO angry 500칼로리 안 넘어서 먹을 수 있음");
        }
    }
}
