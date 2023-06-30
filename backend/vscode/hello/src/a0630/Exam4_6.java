package a0630;

public class Exam4_6 {
    public static void main(String[] args) {

        // 두 눈의 합이 6이 될 때까지 굴림
        // for (int i = 0; true; i++) {
        // int dice1 = (int) (Math.random() * 6) + 1, dice2 = (int) (Math.random() * 6)
        // + 1;
        // System.out.println(dice1);
        // System.out.println(dice2);
        // if (dice1 + dice2 == 6) {
        // System.out.println(dice1);
        // System.out.println(dice2);
        // break;
        // }
        // }

        // 두 눈의 합이 6이 되는 모든 경우의 수 구하기
        int[] dice1 = { 1, 2, 3, 4, 5, 6 };
        int[] dice2 = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        for (int i = 0; i < dice1.length; i++) {
            for (int j = 0; j < dice2.length; j++) {
                sum = dice1[i] + dice2[j];
                if (sum == 6) {
                    System.out.printf("%d, %d%n", dice1[i], dice2[j]);
                }
            }
        }
    }
}