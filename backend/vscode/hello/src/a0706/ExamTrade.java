package a0706;

import java.util.Scanner;

public class ExamTrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hangle han = new Hangle();
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        System.out.println("0부터 99999 중에서 숫자를 입력하세요.");
        int num = sc.nextInt();
        if (num < 0 || num > 99999) {
            System.out.println("0이상, 99999이하의 숫자로 입력해주세요.");
            return;
        }
        num5 = num / 10000;
        num4 = (num % 10000) / 1000;
        num3 = (num % 1000) / 100;
        num2 = (num % 100) / 10;
        num1 = (num % 10) / 1;
        if (num > 10000) {
            han.change(num5);
            han.sum = han.sum + "만";
            han.change(num4);
            if (num4 != 0) {
                han.sum = han.sum + "천";
            }
            han.change(num3);
            if (num3 != 0) {
                han.sum = han.sum + "백";
            }
            han.change(num2);
            if (num2 != 0) {
                han.sum = han.sum + "십";
            }
            han.change(num1);
        } else if (num > 1000) {
            han.change(num4);
            han.sum = han.sum + "천";
            han.change(num3);
            if (num3 != 0) {
                han.sum = han.sum + "백";
            }
            han.change(num2);
            if (num2 != 0) {
                han.sum = han.sum + "십";
            }
            han.change(num1);
        } else if (num > 100) {
            han.change(num3);
            han.sum = han.sum + "백";
            han.change(num2);
            if (num2 != 0) {
                han.sum = han.sum + "십";
            }
            han.change(num1);
        } else if (num > 10) {
            han.change(num2);
            han.sum = han.sum + "십";
            han.change(num1);
        } else if (num == 0) {
            System.out.println("영");
        } else {
            han.change(num1);
        }

        System.out.println(han.sum);

    }
}

class Hangle {
    String sum = "";

    Hangle() {
    }

    void change(int n) {
        if (n == 1) {
            sum = sum + "일";
        } else if (n == 2) {
            sum = sum + "이";
        } else if (n == 3) {
            sum = sum + "삼";
        } else if (n == 4) {
            sum = sum + "사";
        } else if (n == 5) {
            sum = sum + "오";
        } else if (n == 6) {
            sum = sum + "육";
        } else if (n == 7) {
            sum = sum + "칠";
        } else if (n == 8) {
            sum = sum + "팔";
        } else if (n == 9) {
            sum = sum + "구";
        } else if (n == 0) {
        }
    }
}