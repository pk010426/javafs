package a0630;

public class Exam5_2 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 }
        };
        int total = 0;
        float average = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i][j];
                // 이중 배열이 몇 개인가 구하기 위해 넣음
                average++;
            }
        }
        // 총합 / 배열 개수
        average = total / average;

        System.out.println("total = " + total);
        System.out.println("average = " + average);
    }
}