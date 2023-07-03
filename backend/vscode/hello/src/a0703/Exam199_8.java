package a0703;

public class Exam199_8 {
    public static void main(String[] args) {
        int[][] arr = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        int num = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                num = num + arr[i][j];
                count++;
            }
        }

        System.out.println("총 합 : " + num);
        System.out.println("평균 : " + num / (float) count);
    }
}
