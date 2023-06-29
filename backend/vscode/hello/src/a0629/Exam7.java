package a0629;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("메뉴를 선택 하세요. > ");
            int menu_num = scanner.nextInt();

            switch (menu_num) {
                case 1:
                    System.out.print("예금하실 금액을 입력하세요 : ");
                    balance += scanner.nextInt();
                    System.out.printf("현재 통장 잔고는 %d 원 입니다.%n", balance);
                    break;
                case 2:
                    System.out.print("출금하실 금액을 입력하세요 : ");
                    balance -= scanner.nextInt();
                    System.out.printf("현재 통장 잔고는 %d 원 입니다.%n", balance);
                    if (balance < 0) {
                        System.out.printf("대출금이 %d 원 남았습니다.", -1 * balance);
                    }
                    break;
                case 3:
                    System.out.printf("당신의 예금액은 %d 입니다.%n", balance);
                    if (balance < 0) {
                        System.out.printf("대출금이 %d 원 남았습니다.", -1 * balance);
                    }
                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
                    break;
            }
        }
    }
}