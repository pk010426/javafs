package a0629;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        String inpuString;

        do {
            System.out.print(" > ");
            inpuString = scanner.nextLine();
            System.out.print("당신이 입력한 문장 > ");
            System.out.println(inpuString);
        } while (!inpuString.equals("q"));
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
