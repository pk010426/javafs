package a0706;

import java.util.Calendar;
import java.util.Scanner;

public class BirthExam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar time = Calendar.getInstance();
        System.out.println("생년월일 6자리를 입력하세요");
        int number = sc.nextInt();
        System.out.println("주민번호 7번째 자리를 입력하세요.");
        int male = sc.nextInt();
        int birth_year;
        if (male == 1 || male == 2) {
            birth_year = 1900 + number / 10000;
        } else {
            birth_year = 2000 + number / 10000;
        }
        
        int todayYear = time.get(Calendar.YEAR);
        int todayMonth = time.get(Calendar.MONTH) + 1;
        int todayDate = time.get(Calendar.DATE);
        int age = todayYear - birth_year;
        int birthMonth = (number % 10000) / 100;
        int birthDate = (number % 10000) % 100;

        System.out.println(todayYear);
        System.out.println(todayMonth);
        System.out.println(todayDate);
        System.out.println(birthMonth);
        System.out.println(birthDate);
        if (todayYear > birth_year) {
            if (todayMonth > birthMonth) {
                if (todayDate < birthDate) {

                }
            }
        }
        System.out.println("나이는 : " + age);
    }
}
