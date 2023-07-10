package a0707.정렬;

import java.util.Arrays;
import java.util.Collections;

public class arr3 {
    public static void main(String[] args) {
        String arr[] = { "peach", "banana", "mango", "grape", "pineapple", "apple" };
        Arrays.sort(arr,Collections.reverseOrder());
        for (String i : arr) {
            System.out.printf("[" + i + "]");
        }
    }
}
