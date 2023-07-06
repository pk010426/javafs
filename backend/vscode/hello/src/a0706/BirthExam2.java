package a0706;

import java.util.Scanner;

public class BirthExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int male = sc.nextInt();
        int birth_year;
        if (male == 1 || male == 2) {
            birth_year = 1900 + number / 10000;
        } else {
            birth_year = 2000 + number / 10000;
        }
        int age = 2023 - birth_year;
        System.out.println(birth_year);
        System.out.println("나이는 : " + age);
    }
}
