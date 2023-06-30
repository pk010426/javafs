package a0630;

public class Exam5_1 {
    public static void main(String[] args) {
        // 1. 5. 번이 잘못 되었다. arr[5]는 arr배열의 5번을 가르키는데, arr은 배열로 선언된 적이 없다.
        // 2. 2
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
        }
        System.out.printf("arr 배열의 담긴 총합은 : %d%n", sum);
    }
}
