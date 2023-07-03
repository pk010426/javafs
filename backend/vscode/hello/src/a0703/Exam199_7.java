package a0703;

public class Exam199_7 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 2 };
        int num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                num = arr[i];
            }
        }
        System.out.println("최대값은 : " + num);
    }
}
