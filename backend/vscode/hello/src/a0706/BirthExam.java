package a0706;

import java.util.Calendar;
import java.util.Scanner;

public class BirthExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 앞에서부터 7자리를 입력하세요");
        String bNum = sc.nextLine();
        Calendar cal = Calendar.getInstance();
        int a = Integer.parseInt(bNum);
        String y = bNum.substring(0, 2);
        String m = bNum.substring(2, 4);
        String d = bNum.substring(4, 6);
        String g = bNum.substring(6);
        String gender = "";

        if (g.equals("1")) {
            g = "19";
            gender = "남";
        } else if (g.equals("2")) {
            g = "19";
            gender = "여";
        } else if (g.equals("3")) {
            g = "20";
            gender = "남";
        } else if (g.equals("4")) {
            g = "20";
            gender = "여";
        } else {
            System.out.println("외국인");
        }
        System.out.printf("%s%s년 %s월 %s일 %s ", g, y, m, d, gender);
        int age = Integer.parseInt(g + y);
        System.out.println("나이 : " + (cal.get(Calendar.YEAR) - age + 1));
    }

}
