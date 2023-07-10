package a0707;

import java.util.Arrays;

public class calculator {

    static int[] arr = new int[10];

    static void cal(int a1, int b1) {
        arr[0] = a1 + b1;
        arr[1] = b1 + a1;
        arr[2] = a1 - b1;
        arr[3] = b1 - a1;
        arr[4] = a1 * b1;
        arr[5] = b1 * a1;
        arr[6] = a1 / b1;
        arr[7] = b1 / a1;
        arr[8] = (int) Math.pow(a1, b1);
        arr[9] = (int) Math.pow(b1, a1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(calculator.arr);
        System.out.println(arr[9]);
    }
}
