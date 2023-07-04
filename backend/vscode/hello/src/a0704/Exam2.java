package a0704;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("실수 하나를 입력하세요");
        float a = sc.nextFloat();
        // System.out.printf("%.2f", a); //방법 1

        a = (a + 0.005f) * 100;
        System.out.println(a);
        int i = (int) a;
        System.out.println(i);
        a = (float) i / 100; 
        System.out.println(a);
    }
}
