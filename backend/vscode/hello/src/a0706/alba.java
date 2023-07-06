package a0706;

import java.util.Scanner;

public class alba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        days dy = new days();
        System.out.printf("오늘의 요일을 숫자로 입력하세요.\n1.월요일 | 2.화요일 | 3.수요일 | 4.목요일 | 5.금요일 | 6.토요일 | 7.일요일\n >> ");
        int date = sc.nextInt();
        if (!(date >= 1 || date <= 7)) {
            System.out.println("1~7까지만 입력하세요!");
            return;
        }
        dy.today(date);
    }
}

class days {
    String day;

    days() {
    }

    void today(int d) {
        if (d == 1) {
            day = "월요일";
        } else if (d == 2) {
            day = "화요일";
        } else if (d == 3) {
            day = "수요일";
        } else if (d == 4) {
            day = "목요일";
        } else if (d == 5) {
            day = "금요일";
        } else if (d == 6) {
            day = "토요일";
        } else if (d == 7) {
            day = "일요일";
        }

        if (d % 2 != 0) {
            System.out.printf("Oh My God! 오늘은 %s이네요! 알바 가는 날... ", day);
        } else {
            System.out.printf("Enjoy! 오늘은 %s이네요! 노는 날!!! ", day);
        }
    }
}