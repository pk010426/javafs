package a0703;

import java.util.Scanner;

public class 자바정석153p_5_6 {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner sc = new Scanner(System.in);
        char sum;
        int ran = 0;
        String str = "";
        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray();

            for (int j = 0; j < words[i].length(); j++) {
                ran = (int) (Math.random() * words[i].length());
                sum = question[ran];
                question[ran] = question[j];
                question[j] = sum;
            }
            str = String.valueOf(question);

            while (true) {
                System.out.printf("%d 번 : %s의 정답을 입력해 주세요. > ", i + 1, str);
                String answer = sc.nextLine();
                if (words[i].equals(answer)) {
                    System.out.println("정답을 맞췄습니다!");
                    break;
                } else {
                    System.out.println("오답입니다!");
                }
            }
        }

    }
}
