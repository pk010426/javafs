package a0707.정렬;

import java.util.Arrays;

public class arr1 {
    public static void main(String[] args) {
        String arr[] = { "peach", "banana", "mango", "grape", "pineapple", "apple" };
        Arrays.sort(arr);

        for (String i : arr) {
            System.out.printf("[" + i + "]");
        }
    }
}
