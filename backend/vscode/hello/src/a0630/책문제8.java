package a0630;

public class 책문제8 {
    public static void main(String[] args) {
        // 배열 전체 합과 편균 구하기 중첩 for문 이용이 조건
        int[][] array = {
                { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 }
        };
        int sum = 0, num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                num++;
            }
        }
        System.out.printf("합 : %d%n", sum);
        System.out.printf("평균 : %.1f%n", sum / (float) num);
    }

}
