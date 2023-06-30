package a0630;

public class 배열_내림차순정렬 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 8, 20 };
        int num = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                num = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = num;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
