package a0630;

public class Ex5_9 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }
        };

        int kototal = 0, entotal = 0, mathtotal = 0;
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("-----------------------------");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            kototal = kototal + score[i][0];
            entotal = entotal + score[i][1];
            mathtotal = mathtotal + score[i][2];

            // 1 2 3 4 숫자 표기.
            System.out.printf("%3d", i + 1);

            for (int j = 0; j < score[i].length; j++) {
                sum = sum + score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            System.out.printf("%5d", sum);
            System.out.printf("%6.1f", sum / (float)score[i].length);
            System.out.println();
        }
        System.out.println("-----------------------------");
        System.out.printf("총점: %3d %3d %3d", kototal, entotal, mathtotal);
    }
}
