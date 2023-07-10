package a0707.정렬;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int arr[] = { 4, 23, 33, 15, 17, 19 };
        Arrays.sort(arr);

        for (int i : arr) {
            System.out.printf("[" + i + "]");
        }
    }
}
