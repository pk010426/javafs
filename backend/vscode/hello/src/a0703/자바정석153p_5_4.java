package a0703;

public class 자바정석153p_5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 }
        };

        int total =0;
        float avg =0;
        
        for (int i =0; i < arr.length; i++){
            for (int j =0; j < arr[i].length; j++) {
                total += arr[i][j];
                avg++;
            }
        }
        avg = total /avg;
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + avg);
    }
}
