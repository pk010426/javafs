package a0629;

public class Exam3 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                num += i;
            }
        }
        System.out.println(num);

        // for (int i = 0; i <= 100; i += 3) {
        //     num = num + i;
        // }
        // System.out.println(num);

    }
}
