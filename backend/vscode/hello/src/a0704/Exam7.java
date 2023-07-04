package a0704;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int run = 1;
        while (run == 1) {

            System.out.println("\n종료를 원하시면 0을 입력하세요.");
            System.out.println("1 ~ 12월을 숫자만 입력해주세요.");
            
            if (sc.hasNextInt()) {
                month = sc.nextInt();
            } else {
                System.out.println("숫자가 입력되지 않았습니다.");
            }

            if (month == 0) {
                System.out.println("프로그램 종료");
                run = 0;
                break;
            }

            if (month < 1 || month > 12) {
                System.out.println("1~12까지만 입력 가능합니다!");
                continue;
            }

            if (month >= 3 && month <= 5) {
                System.out.printf("%d월은 봄입니다. Spring!%n", month);
            } else if (month >= 6 && month <= 8) {
                System.out.printf("%d월은 여름입니다. Summer!%n", month);
            } else if (month >= 9 && month <= 11) {
                System.out.printf("%d월은 가을입니다. Fall!%n", month);
            } else {
                System.out.printf("%d월은 겨울입니다. Winter!%n", month);
            }

        }
    }
}