package a0711;

import java.util.Arrays;
import java.util.Random;

public class RandomExam_1 {
    public static void main(String[] args) {
        // 선택번호

            int[] selectNumber = new int[6];
            // 시드값이 같으면 동일한 난수 생성
            Random random = new Random();
            System.out.print("선택 번호 : ");

            for (int i = 0; i < 6; i++) {
                selectNumber[i] = random.nextInt(45) + 1;
                System.out.print(selectNumber[i] + " ");
            }
            System.out.println();
            int[] winningNumber = new int[6];
            random = new Random();
            System.out.print("당첨 번호 : ");

            for (int i = 0; i < 6; i++) {
                winningNumber[i] = random.nextInt(45) + 1;
                System.out.print(winningNumber[i] + " ");
            }
            System.out.println();

            Arrays.sort(selectNumber);
            Arrays.sort(winningNumber);
            boolean result = Arrays.equals(selectNumber, winningNumber);
           

            if (result) {
                System.out.println("1등 당첨");
            } else {
                System.out.println("당첨되지 않음");
            }
        }
    }
