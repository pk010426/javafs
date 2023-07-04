package a0704.static_class;


import java.util.Scanner;

public class hasint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("원하는 달을 입력하세요> ");
            if (scan.hasNextInt()) {
                month = scan.nextInt();
                if (month >= 1 && month <= 12) {
                    validInput = true;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } else {
                String gap = scan.nextLine();
                System.out.println(gap + "은 숫자가 아닙니다!");
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("겨울 (Winter)");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("봄 (Spring)");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("가을 (Fall)");
        }
    }
}
